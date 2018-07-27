package com.observer.test;
//显示板
public class CurrentConditions {
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
		System.out.println("今天温度："+mTemperature);
		System.out.println("今天湿度:"+mHumidity);
		System.out.println("今天气压："+mPressure);
	}
}
