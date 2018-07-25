package com.strategy.quack.behavior;

public class ScrannelQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("鸭子叫声比较难听");
	}
	
}
