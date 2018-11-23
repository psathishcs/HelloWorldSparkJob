package org.hello.spark;


import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class FlightDataCSVtoHive {
	static SparkSession spark;
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No files provided");
			System.exit(0);
		}
		spark =  SparkSession.builder().appName("Read flight CSV data and write to flight_data Hive table").getOrCreate();
		Dataset<Row> flightData = readCSV(args[0]);
		flightData.show();
		System.out.println("Flight data count : " + flightData.count());
	}
	private static Dataset<Row> readCSV(String fileName) {
		Dataset<Row> flightData = spark.read().format("csv").option("header", "true").load("hdfs://localhost:9000/"+ fileName);
		return flightData;

	}
}
