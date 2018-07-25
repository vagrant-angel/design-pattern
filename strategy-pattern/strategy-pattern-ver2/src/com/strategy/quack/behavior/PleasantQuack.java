package com.strategy.quack.behavior;

public class PleasantQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("鸭子叫声好听");
	}

}
