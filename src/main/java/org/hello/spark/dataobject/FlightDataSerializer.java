package org.hello.spark.dataobject;

import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FlightDataSerializer implements Serializer<FlightData> {

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public byte[] serialize(String topic, FlightData data) {
		byte[] flightDataBytes = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			flightDataBytes = objectMapper.writeValueAsString(data).getBytes();
		}catch(Exception e) {
			
		}
		return flightDataBytes;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}


}
