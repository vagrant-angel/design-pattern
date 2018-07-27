package com.observer.test;
//气象站
public class WeatherData {
	private float mTemperature;
	private float mHumidity;
	private float mPressure;
	
	private CurrentConditions currentConditions;
	
	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}

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
		currentConditions.update(mTemperature, mHumidity, mPressure);
	}
	public void setData(float mTemperature, float mHumidity,float mPressure){
		this.mTemperature = mTemperature;
		this.mHumidity = mHumidity;
		this.mPressure = mPressure;
		dataChange();
	}
	
}
