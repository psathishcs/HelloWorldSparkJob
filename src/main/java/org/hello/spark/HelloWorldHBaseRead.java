package org.hello.spark;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.spark.JavaHBaseContext;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class HelloWorldHBaseRead {
	public static void main(String[] args) {
		SparkConf sparkConf = new SparkConf().setAppName("HelloWorldHBaseRead").setMaster("skylark.datalake");
		JavaSparkContext jsc = new JavaSparkContext(sparkConf);
		Configuration conf = HBaseConfiguration.create();
		JavaHBaseContext hbaseContext = new JavaHBaseContext(jsc, conf);
		Scan scan = new Scan();
		scan.setCaching(100);
		JavaRDD hbaseRdd = hbaseContext.hbaseRDD(TableName.valueOf("emp"), scan);
		
	}
}
