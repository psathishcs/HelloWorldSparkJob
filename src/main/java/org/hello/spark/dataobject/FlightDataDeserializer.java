package org.hello.spark.dataobject;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FlightDataDeserializer implements Deserializer<FlightData> {

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FlightData deserialize(String topic, byte[] data) {
		FlightData flightData = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			flightData = objectMapper.readValue(data, FlightData.class);
		}catch(Exception e) {
			
		}
		return flightData;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
