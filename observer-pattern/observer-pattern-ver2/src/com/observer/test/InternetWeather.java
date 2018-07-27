package com.observer.test;

import com.observer.services.impl.CurrentConditions;
import com.observer.services.impl.FutureConditions;
import com.observer.services.impl.WeatherData;

//观察者模式
public class InternetWeather {
	public static void main(String[] args) {
		CurrentConditions currentConditions = new CurrentConditions();
		WeatherData weatherData = new WeatherData();
		FutureConditions futureConditions = new FutureConditions();
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(futureConditions);
		weatherData.setData(23, 44, 55);
	}
}
