package org.hello.spark;


import org.apache.spark.SparkConf;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SaveMode;
import org.apache.spark.sql.SparkSession;

public class FlightDataCSVtoHive {
	static SparkSession spark;
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No files provided");
			System.exit(0);
		}
		String fileName = args[0];
		SparkConf conf = new SparkConf();
		if (System.getenv("env") != null && System.getenv("env").equals("local")) {
			conf.setMaster("local")
			.set("spark.driver.host", "localhost")
			.set("hive.metastore.uris", "thrift://skylark.datalake:9083");
			
		}
		spark =  SparkSession.builder().config(conf)
				.appName("Read flight CSV data and write to flight_data Hive table")
				.enableHiveSupport()
				.getOrCreate();
		Dataset<Row> flightData = readCSV(fileName);
		flightData.show();
		flightData.write().mode(SaveMode.Overwrite).saveAsTable("flight.flight_data");
	}
	private static Dataset<Row> readCSV(String fileName) {
		Dataset<Row> flightData = spark.read().format("csv").option("header", "true").load("hdfs://skylark.datalake:9000/"+ fileName);
		return flightData;

	}
}
