package com.observer.services.impl;

import java.util.ArrayList;

import com.observer.services.Observer;
import com.observer.services.Subject;

//气象站
public class WeatherData implements Subject {
	private float mTemperature;
	private float mHumidity;
	private float mPressure;
	private ArrayList<Observer> observersList;
	
	public WeatherData() {
		this.observersList = new ArrayList<>();
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
		notifyObserver();
	}
	public void setData(float mTemperature, float mHumidity,float mPressure){
		this.mTemperature = mTemperature;
		this.mHumidity = mHumidity;
		this.mPressure = mPressure;
		dataChange();
	}

	@Override
	public void registerObserver(Observer o) {
		observersList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		if (observersList.contains(o)){
			observersList.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observersList) {
			observer.update(mTemperature, mHumidity, mPressure);
		}
	}
	
}
