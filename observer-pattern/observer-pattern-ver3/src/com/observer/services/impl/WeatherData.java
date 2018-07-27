package com.observer.services.impl;

import java.util.Observable;

//继承Observable类，不需要自定义实现注册、删除和通知功能
public class WeatherData extends Observable {
	private float mTemperature;
	private float mHumidity;
	private float mPressure;
	

	public float getmTemperature() {
		return mTemperature;
	}

	public void setmTemperature(float mTemperature) {
		this.mTemperature = mTemperature;
	}

	public float getmHumidity() {
		return mHumidity;
	}

	public void setmHumidity(float mHumidity) {
		this.mHumidity = mHumidity;
	}

	public float getmPressure() {
		return mPressure;
	}

	public void setmPressure(float mPressure) {
		this.mPressure = mPressure;
	}
	public void dataChange(){
		this.setChanged();//֪ͨ�仯
		this.notifyObservers(new Data(mTemperature,mHumidity,mPressure));
	}
	public void setData(float mTemperature, float mHumidity,float mPressure){
		this.mTemperature = mTemperature;
		this.mHumidity = mHumidity;
		this.mPressure = mPressure;
		dataChange();
	}
	//ʹ���ڲ���ʵ�����ݵķ�װ
	public class Data{
		public float mTemperature;
		public float mHumidity;
		public float mPressure;
		public Data(float mTemperature,float mHumidity,float mPressure){
			this.mTemperature = mTemperature;
			this.mHumidity = mHumidity;
			this.mPressure = mPressure;
		}
	}
}
