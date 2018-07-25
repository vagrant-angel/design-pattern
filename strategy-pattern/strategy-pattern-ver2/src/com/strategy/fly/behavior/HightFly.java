package com.strategy.fly.behavior;

public class HightFly implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("鸭子飞的比较高");
	}
}
