package com.strategy.domain;

import com.strategy.fly.behavior.HightFly;
import com.strategy.quack.behavior.PleasantQuack;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		flyBehavior = new HightFly();
		quackBehavior = new PleasantQuack();
	}
	@Override
	public void display() {
		System.out.println("---鸭子为红色---");
	}

}
