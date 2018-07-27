package com.observer.test;

public class InternetWeather {
	public static void main(String[] args) {
		CurrentConditions currentConditions = new CurrentConditions();
		WeatherData weatherData = new WeatherData(currentConditions);
		weatherData.setData(23,45, 67);
	}
}
