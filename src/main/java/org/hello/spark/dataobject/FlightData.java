package org.hello.spark.dataobject;

import java.io.Serializable;

/**
 * 
 * @author SathishParthasarathy
 * @date Nov-12-2018,7:36:06 AM
 */

public class FlightData implements Serializable { 
	private static final long serialversionUID = 129348938L; 
	private Integer year;
	private Integer month;
	private Integer day;
	private Integer day_of_week;
	private Integer dep_time;
	private Integer crs_dep_time;
	private Integer arr_time;
	private Integer crs_arr_time;
	private String unique_carrier;
	private Integer flight_num;
	private String tail_num;
	private Integer actual_elapsed_time;
	private Integer crs_elapsed_time;
	private Integer air_time;
	private Integer arr_delay;
	private Integer dep_delay;
	private String origin;
	private String dest;
	private Integer distance;
	private Integer taxi_in;
	private Integer taxi_out;
	private Integer cancelled;
	private String cancellation_code;
	private Integer diverted;
	private String carrier_delay;
	private String weather_delay;
	private String nas_delay;
	private String security_delay;
	private String late_aircraft_delay;
	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getDay_of_week() {
		return day_of_week;
	}
	public void setDay_of_week(Integer day_of_week) {
		this.day_of_week = day_of_week;
	}
	public Integer getDep_time() {
		return dep_time;
	}
	public void setDep_time(Integer dep_time) {
		this.dep_time = dep_time;
	}
	public Integer getCrs_dep_time() {
		return crs_dep_time;
	}
	public void setCrs_dep_time(Integer crs_dep_time) {
		this.crs_dep_time = crs_dep_time;
	}
	public Integer getArr_time() {
		return arr_time;
	}
	public void setArr_time(Integer arr_time) {
		this.arr_time = arr_time;
	}
	public Integer getCrs_arr_time() {
		return crs_arr_time;
	}
	public void setCrs_arr_time(Integer crs_arr_time) {
		this.crs_arr_time = crs_arr_time;
	}
	public String getUnique_carrier() {
		return unique_carrier;
	}
	public void setUnique_carrier(String unique_carrier) {
		this.unique_carrier = unique_carrier;
	}
	public Integer getFlight_num() {
		return flight_num;
	}
	public void setFlight_num(Integer flight_num) {
		this.flight_num = flight_num;
	}
	public String getTail_num() {
		return tail_num;
	}
	public void setTail_num(String tail_num) {
		this.tail_num = tail_num;
	}
	public Integer getActual_elapsed_time() {
		return actual_elapsed_time;
	}
	public void setActual_elapsed_time(Integer actual_elapsed_time) {
		this.actual_elapsed_time = actual_elapsed_time;
	}
	public Integer getCrs_elapsed_time() {
		return crs_elapsed_time;
	}
	public void setCrs_elapsed_time(Integer crs_elapsed_time) {
		this.crs_elapsed_time = crs_elapsed_time;
	}
	public Integer getAir_time() {
		return air_time;
	}
	public void setAir_time(Integer air_time) {
		this.air_time = air_time;
	}
	public Integer getArr_delay() {
		return arr_delay;
	}
	public void setArr_delay(Integer arr_delay) {
		this.arr_delay = arr_delay;
	}
	public Integer getDep_delay() {
		return dep_delay;
	}
	public void setDep_delay(Integer dep_delay) {
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
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	public Integer getTaxi_in() {
		return taxi_in;
	}
	public void setTaxi_in(Integer taxi_in) {
		this.taxi_in = taxi_in;
	}
	public Integer getTaxi_out() {
		return taxi_out;
	}
	public void setTaxi_out(Integer taxi_out) {
		this.taxi_out = taxi_out;
	}
	public Integer getCancelled() {
		return cancelled;
	}
	public void setCancelled(Integer cancelled) {
		this.cancelled = cancelled;
	}
	public String getCancellation_code() {
		return cancellation_code;
	}
	public void setCancellation_code(String cancellation_code) {
		this.cancellation_code = cancellation_code;
	}
	public Integer getDiverted() {
		return diverted;
	}
	public void setDiverted(Integer diverted) {
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
