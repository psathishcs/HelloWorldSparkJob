package org.hello.spark;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka010.ConsumerStrategies;
import org.apache.spark.streaming.kafka010.KafkaUtils;
import org.apache.spark.streaming.kafka010.LocationStrategies;


import scala.Tuple2;

public class FlightDataKafkaToHive {
	static SparkSession spark;
	public static void main(String[] args) throws InterruptedException {
		SparkConf conf = new SparkConf().setMaster("local").setAppName("Kafka Spark Streaming");
		conf.set("hive.metastore.uris", "thrift://skylark.datalake:9083");
		JavaSparkContext sc = new JavaSparkContext(conf);
		JavaStreamingContext ssc = new JavaStreamingContext(sc, Durations.seconds(1));
		sc.setLogLevel("WARN");
		

		Map<String, Object> kafkaParams = new HashMap<String, Object>();
		kafkaParams.put("bootstrap.servers", "skylark.datalake:9092");
		kafkaParams.put("key.deserializer", StringDeserializer.class);
		kafkaParams.put("value.deserializer", StringDeserializer.class);
		kafkaParams.put("group.id", "1");
		kafkaParams.put("auto.offset.reset", "latest");
		kafkaParams.put("enable.auto.commit", false);
		
		Collection<String> topics = Arrays.asList("flight_data");
		JavaInputDStream<ConsumerRecord<String, String>> stream = 
				KafkaUtils.createDirectStream(ssc,
				LocationStrategies.PreferConsistent(),
				ConsumerStrategies.<String, String>Subscribe(topics, kafkaParams));
		
		ssc.start();
		ssc.awaitTermination();

		
	}
}
