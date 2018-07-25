package com.strategy.domain;

import com.strategy.fly.behavior.LowFly;
import com.strategy.quack.behavior.ScrannelQuack;

public class GreenHeadDuck extends Duck {

	public GreenHeadDuck() {
		flyBehavior = new LowFly();
		quackBehavior = new ScrannelQuack();
	}
	@Override
	public void display() {
		System.out.println("----鸭子为绿色------");
	}

}
