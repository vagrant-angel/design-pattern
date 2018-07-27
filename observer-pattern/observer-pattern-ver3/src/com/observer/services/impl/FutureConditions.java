package com.observer.services.impl;

import java.util.Observable;
import java.util.Observer;

import com.observer.services.impl.WeatherData.Data;


public class FutureConditions implements Observer {
	private float mTemperature;
	private float mHumidity;
	private float mPressure;
	
	
	@Override
	public void update(Observable o, Object obj) {
		this.mTemperature = ((Data)(obj)).mTemperature;
		this.mHumidity = ((Data)(obj)).mHumidity;
		this.mPressure = ((Data)(obj)).mPressure;
		display();
	}
	public void display(){
		System.out.println("明天温度："+mTemperature);
		System.out.println("明天湿度："+mHumidity);
		System.out.println("明天气压："+mPressure);
	}
}
