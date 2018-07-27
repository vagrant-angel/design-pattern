package com.observer.services.impl;

import com.observer.services.Observer;

//未来天气显示板
public class FutureConditions implements Observer {
	private float mTemperature;
	private float mHumidity;
	private float mPressure;
	
	public void update(float mTemperature,float mHumidity,float mPressure){
		this.mTemperature = mTemperature;
		this.mHumidity = mHumidity;
		this.mPressure = mPressure;
		display();
	}
	public void display(){
		System.out.println("明天温度:"+mTemperature);
		System.out.println("明天湿度："+mHumidity);
		System.out.println("明天气压："+mPressure);
	}
}
