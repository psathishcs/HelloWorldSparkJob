package org.hello.spark.dataobject;

import java.io.Serializable;

/**
 * 
 * @author SathishParthasarathy
 * @date Nov-12-2018,7:36:06 AM
 */

public class FlightData implements Serializable { 
	private static final long serialversionUID = 129348938L; 
	private String year;
	private String month;
	private String day;
	private String day_of_week;
	private String dep_time;
	private String crs_dep_time;
	private String arr_time;
	private String crs_arr_time;
	private String unique_carrier;
	private String flight_num;
	private String tail_num;
	private String actual_elapsed_time;
	private String crs_elapsed_time;
	private String air_time;
	private String arr_delay;
	private String dep_delay;
	private String origin;
	private String dest;
	private String distance;
	private String taxi_in;
	private String taxi_out;
	private String cancelled;
	private String cancellation_code;
	private String diverted;
	private String carrier_delay;
	private String weather_delay;
	private String nas_delay;
	private String security_delay;
	private String late_aircraft_delay;
	
	
	public FlightData(String year, String month, String day, String day_of_week, String dep_time,
			String crs_dep_time, String arr_time, String crs_arr_time, String unique_carrier, String flight_num,
			String tail_num, String actual_elapsed_time, String crs_elapsed_time, String air_time, String arr_delay,
			String dep_delay, String origin, String dest, String distance, String taxi_in, String taxi_out,
			String cancelled, String cancellation_code, String diverted, String carrier_delay, String weather_delay,
			String nas_delay, String security_delay, String late_aircraft_delay) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.day_of_week = day_of_week;
		this.dep_time = dep_time;
		this.crs_dep_time = crs_dep_time;
		this.arr_time = arr_time;
		this.crs_arr_time = crs_arr_time;
		this.unique_carrier = unique_carrier;
		this.flight_num = flight_num;
		this.tail_num = tail_num;
		this.actual_elapsed_time = actual_elapsed_time;
		this.crs_elapsed_time = crs_elapsed_time;
		this.air_time = air_time;
		this.arr_delay = arr_delay;
		this.dep_delay = dep_delay;
		this.origin = origin;
		this.dest = dest;
		this.distance = distance;
		this.taxi_in = taxi_in;
		this.taxi_out = taxi_out;
		this.cancelled = cancelled;
		this.cancellation_code = cancellation_code;
		this.diverted = diverted;
		this.carrier_delay = carrier_delay;
		this.weather_delay = weather_delay;
		this.nas_delay = nas_delay;
		this.security_delay = security_delay;
		this.late_aircraft_delay = late_aircraft_delay;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getDay_of_week() {
		return day_of_week;
	}
	public void setDay_of_week(String day_of_week) {
		this.day_of_week = day_of_week;
	}
	public String getDep_time() {
		return dep_time;
	}
	public void setDep_time(String dep_time) {
		this.dep_time = dep_time;
	}
	public String getCrs_dep_time() {
		return crs_dep_time;
	}
	public void setCrs_dep_time(String crs_dep_time) {
		this.crs_dep_time = crs_dep_time;
	}
	public String getArr_time() {
		return arr_time;
	}
	public void setArr_time(String arr_time) {
		this.arr_time = arr_time;
	}
	public String getCrs_arr_time() {
		return crs_arr_time;
	}
	public void setCrs_arr_time(String crs_arr_time) {
		this.crs_arr_time = crs_arr_time;
	}
	public String getUnique_carrier() {
		return unique_carrier;
	}
	public void setUnique_carrier(String unique_carrier) {
		this.unique_carrier = unique_carrier;
	}
	public String getFlight_num() {
		return flight_num;
	}
	public void setFlight_num(String flight_num) {
		this.flight_num = flight_num;
	}
	public String getTail_num() {
		return tail_num;
	}
	public void setTail_num(String tail_num) {
		this.tail_num = tail_num;
	}
	public String getActual_elapsed_time() {
		return actual_elapsed_time;
	}
	public void setActual_elapsed_time(String actual_elapsed_time) {
		this.actual_elapsed_time = actual_elapsed_time;
	}
	public String getCrs_elapsed_time() {
		return crs_elapsed_time;
	}
	public void setCrs_elapsed_time(String crs_elapsed_time) {
		this.crs_elapsed_time = crs_elapsed_time;
	}
	public String getAir_time() {
		return air_time;
	}
	public void setAir_time(String air_time) {
		this.air_time = air_time;
	}
	public String getArr_delay() {
		return arr_delay;
	}
	public void setArr_delay(String arr_delay) {
		this.arr_delay = arr_delay;
	}
	public String getDep_delay() {
		return dep_delay;
	}
	public void setDep_delay(String dep_delay) {
		this.dep_delay = dep_delay;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getTaxi_in() {
		return taxi_in;
	}
	public void setTaxi_in(String taxi_in) {
		this.taxi_in = taxi_in;
	}
	public String getTaxi_out() {
		return taxi_out;
	}
	public void setTaxi_out(String taxi_out) {
		this.taxi_out = taxi_out;
	}
	public String getCancelled() {
		return cancelled;
	}
	public void setCancelled(String cancelled) {
		this.cancelled = cancelled;
	}
	public String getCancellation_code() {
		return cancellation_code;
	}
	public void setCancellation_code(String cancellation_code) {
		this.cancellation_code = cancellation_code;
	}
	public String getDiverted() {
		return diverted;
	}
	public void setDiverted(String diverted) {
		this.diverted = diverted;
	}
	public String getCarrier_delay() {
		return carrier_delay;
	}
	public void setCarrier_delay(String carrier_delay) {
		this.carrier_delay = carrier_delay;
	}
	public String getWeather_delay() {
		return weather_delay;
	}
	public void setWeather_delay(String weather_delay) {
		this.weather_delay = weather_delay;
	}
	public String getNas_delay() {
		return nas_delay;
	}
	public void setNas_delay(String nas_delay) {
		this.nas_delay = nas_delay;
	}
	public String getSecurity_delay() {
		return security_delay;
	}
	public void setSecurity_delay(String security_delay) {
		this.security_delay = security_delay;
	}
	public String getLate_aircraft_delay() {
		return late_aircraft_delay;
	}
	public void setLate_aircraft_delay(String late_aircraft_delay) {
		this.late_aircraft_delay = late_aircraft_delay;
	}
	
	

	
}
