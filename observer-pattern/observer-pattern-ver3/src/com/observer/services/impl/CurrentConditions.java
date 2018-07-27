package com.observer.services.impl;

import java.util.Observable;
import java.util.Observer;

import com.observer.services.impl.WeatherData.Data;

//实现Observer接口
public class CurrentConditions implements Observer {
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
		System.out.println("今天温度："+mTemperature);
		System.out.println("今天湿度："+mHumidity);
		System.out.println("今天气压："+mPressure);
	}
}
