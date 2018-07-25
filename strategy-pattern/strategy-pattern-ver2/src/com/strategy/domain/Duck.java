package com.strategy.domain;

import com.strategy.fly.behavior.FlyBehavior;
import com.strategy.quack.behavior.QuackBehavior;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	public void quack(){
		quackBehavior.quack();
	}
	public abstract void display();
	public void fly(){
		flyBehavior.fly();
	}
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
	public void swim(){
		System.out.println("—º◊”ª·”Œ”æ");
	}
}
