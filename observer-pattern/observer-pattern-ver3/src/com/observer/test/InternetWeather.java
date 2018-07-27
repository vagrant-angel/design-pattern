package com.observer.test;

import com.observer.services.impl.CurrentConditions;
import com.observer.services.impl.FutureConditions;
import com.observer.services.impl.WeatherData;

//Java内置模式实现
public class InternetWeather {
	public static void main(String[] args) {
		CurrentConditions currentConditions = new CurrentConditions();
		WeatherData weatherData = new WeatherData();
		FutureConditions futureConditions = new FutureConditions();
		weatherData.addObserver(currentConditions);
		weatherData.addObserver(futureConditions);
		weatherData.setData(23, 44, 55);
	}
}
