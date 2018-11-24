package org.hello.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.SparkSession;

/**
 * 
 * @author SathishParthasarathy
 *
 * Lazily instantiated singleton instance of SparkSession
 */
public class JavaSparkSessionSingleton {
	private static transient SparkSession instance = null;

	public static SparkSession getInstance(SparkConf sparkConf) {
		if (instance == null) {
			instance = SparkSession.builder().config(sparkConf).enableHiveSupport().getOrCreate();
		}
		return instance;
	}
}
