package com.strategy.domain;


public abstract class Duck {
	
	public Duck() {
	}
	public void quack(){
		System.out.println("鸭子会叫");
	}
	public abstract void display();
	public void fly(){
		System.out.println("鸭子会飞");
	}
	public void swim(){
		System.out.println("鸭子会游泳");
	}
}
