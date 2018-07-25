package com.strategy.fly.behavior;

public class LowFly implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("鸭子飞的比较低");
	}

}
