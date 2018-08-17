package com.epam.api.reest_assured_project;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponseDto{
	
	@JsonProperty("City")
	private String city;
	
	@JsonProperty("Temperature")
	private String temperature;
	
	@JsonProperty("Humidity")
	private String humidity;
	
	@JsonProperty("WeatherDescription")
	private String weatherDescription;
	
	@JsonProperty("WindSpeed")
	private String windSpeed;
	
	@JsonProperty("WindDirectionDegree")
	private String windDirectionDegree;
	
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTemperature() {
		return this.temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return this.humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getWeatherDescription() {
		return this.weatherDescription;
	}
	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}
	public String getWindSpeed() {
		return this.windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
	public String getWindDirectionDegree() {
		return windDirectionDegree;
	}
	public void setWindDirectionDegree(String windDirectionDegree) {
		this.windDirectionDegree = windDirectionDegree;
	}	
}
