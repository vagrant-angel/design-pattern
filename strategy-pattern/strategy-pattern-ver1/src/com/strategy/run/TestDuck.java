package com.strategy.run;

import com.strategy.domain.Duck;
import com.strategy.domain.GreenHeadDuck;
import com.strategy.domain.RedHeadDuck;

public class TestDuck {

	public static void main(String[] args) {
		Duck redDuck = new RedHeadDuck();
		redDuck.fly();
		redDuck.quack();
		redDuck.display();
		Duck greenDuck = new GreenHeadDuck();
		greenDuck.fly();
		greenDuck.quack();
		greenDuck.display();
		
	}

}
