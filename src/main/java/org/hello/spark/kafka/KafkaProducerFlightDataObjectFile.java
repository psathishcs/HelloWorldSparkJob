package org.hello.spark.kafka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.hello.spark.dataobject.FlightData;

public class KafkaProducerFlightDataObjectFile {
	@SuppressWarnings("unchecked")
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
		properties.put("group.id", "rita");
		properties.put("client.id", "KafkaFileProducer");
		properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		properties.put("value.serializer", "org.hello.spark.dataobject.FlightDataSerializer");
		
		KafkaProducer kafkaProducer = new KafkaProducer<String, String>(properties);
		int count = 0;
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			while ((line = bufferedReader.readLine()) != null) {
				List<String> result = Arrays.asList(line.split(","));
				FlightData record = new FlightData(result.get(0), result.get(1), result.get(2), result.get(3),
						result.get(4), result.get(5), result.get(6), result.get(7), result.get(8), result.get(9),
						result.get(10), result.get(11), result.get(12), result.get(13), result.get(14), result.get(15),
						result.get(16), result.get(17), result.get(18), result.get(19), result.get(20), result.get(21),
						result.get(22), result.get(23), result.get(24), result.get(25), result.get(26), result.get(27),
						result.get(28));
				kafkaProducer.send(new ProducerRecord(topic, Integer.toString(++count), record));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			kafkaProducer.close();
		}
	}

}
