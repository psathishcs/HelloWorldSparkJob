package org.hello.spark;


import java.util.Arrays;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SaveMode;
import org.apache.spark.sql.SparkSession;

import scala.Tuple2;

public class HelloWordCountHive {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No files provided");
			System.exit(0);
		}
		wordCount(args[0]);
	}
	private static void wordCount(String fileName) {
		SparkSession session =  SparkSession
				.builder()
				.appName("Word Counter Hive")
				.config("spark.master", "local")
				.config("hive.metastore.uris", "thrift://localhost:9083")
				//.config("spark.sql.warehouse.dir", "/user/hive/warehouse")
				.enableHiveSupport()
				.getOrCreate();
		JavaRDD<String> inputFile = ( session.read().csv("hdfs://localhost:9000/"+fileName).javaRDD().map(row -> row.toString()));
		JavaRDD<String> wordFromsFile = inputFile.flatMap(content -> Arrays.asList(content.split(",")).iterator());
		JavaPairRDD<String, Integer> counts = wordFromsFile.mapToPair(word -> new Tuple2<>(word, 1)).reduceByKey((a, b) -> (int)a +(int)b);
		Dataset<Row> wordCountDS = session.createDataset(counts.collect(), Encoders.tuple(Encoders.STRING(), Encoders.INT())).toDF("word", "count");
		wordCountDS.show();
		System.out.println("wordCountDS.count(): " + wordCountDS.count());
		wordCountDS.write().mode(SaveMode.Overwrite).saveAsTable("hello.word_count");


	}
}
