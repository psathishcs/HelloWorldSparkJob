package org.hello.spark;

import java.util.Arrays;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import scala.Tuple2;

public class HelloWordCountHDFS {
	public static void main(String[] args) {

		if (args.length == 0) {
			if (args.length == 0) {
				System.out.println("No files provided");
				System.exit(0);
			}
		}
		wordCount(args[0]);
	}
	private static void wordCount(String fileName) {
		SparkConf conf = new SparkConf().setMaster("local").setAppName("JD Word Counter");
		JavaSparkContext context = new JavaSparkContext(conf);
		JavaRDD<String> inputFile = context.textFile("hdfs://"+fileName);
		@SuppressWarnings("unchecked")
		JavaRDD<String> wordFromsFile = inputFile.flatMap(content -> Arrays.asList(content.split(",")).iterator());
		JavaPairRDD<String, Integer> counts = wordFromsFile.mapToPair(word -> new Tuple2<>(word, 1)).reduceByKey((a, b) -> (int)a +(int)b);
		counts.saveAsTextFile("hdfs://output/CountData");
	}
}
