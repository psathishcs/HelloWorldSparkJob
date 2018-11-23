package org.hello.spark.kafka;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairInputDStream;
import org.apache.spark.streaming.api.java.JavaReceiverInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;

import kafka.serializer.StringDecoder;
import scala.Tuple2;

public class KafkaSparkStreaming {
	public static void main(String[] args) throws InterruptedException {
		SparkConf conf = new SparkConf().setMaster("local").setAppName("Kafka Spark Streaming");
		JavaSparkContext context = new JavaSparkContext(conf);
		JavaStreamingContext streamingContext = new JavaStreamingContext(context, new Duration(5000));
		Map<String, String> kafkaParams = new HashMap<String, String>();
		kafkaParams.put("bootstrap.servers", "skylark.datalake:9092");
		kafkaParams.put("group.id", "1");
		Set<String> topicName = Collections.singleton("Hello-Kafka");
		JavaPairInputDStream<String, String> kafkaJavaPairInputDStream = KafkaUtils.createDirectStream(streamingContext,
				String.class, String.class, StringDecoder.class, StringDecoder.class, kafkaParams, topicName);
		JavaDStream<String> kafkaDStream = kafkaJavaPairInputDStream
				.map(new Function<Tuple2<String, String>, String>() {
					private static final long serialVersionUID = 1L;

					public String call(Tuple2<String, String> tuple2) {
						return tuple2._2;
					}
				});
		kafkaDStream.print();
		streamingContext.start();
		streamingContext.awaitTermination();

	}
}
