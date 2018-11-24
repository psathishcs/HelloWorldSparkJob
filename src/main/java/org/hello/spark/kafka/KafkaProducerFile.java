package org.hello.spark.kafka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class KafkaProducerFile {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No files provided");
			System.exit(0);
		}
		String fileName = args[0];
		String line = null;
		String topic = "flight_data";
		Properties properties = new Properties();
		properties.put("bootstrap.servers", "skylark.datalake:9092");
		properties.put("group.id", "hello-kafka-java-group");
		 properties.put("client.id", "KafkaFileProducer");
		properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		
		KafkaProducer kafkaProducer = new KafkaProducer<String, String>(properties);
		int count = 0;
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			while ((line = bufferedReader.readLine()) != null) {
				kafkaProducer.send(new ProducerRecord(topic, Integer.toString(++count), line));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			kafkaProducer.close();
		}
	}
}
