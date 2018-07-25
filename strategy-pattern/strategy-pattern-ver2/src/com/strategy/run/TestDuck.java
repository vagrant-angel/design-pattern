package com.strategy.run;

import com.strategy.domain.Duck;
import com.strategy.domain.GreenHeadDuck;
import com.strategy.domain.RedHeadDuck;
import com.strategy.fly.behavior.HightFly;
import com.strategy.quack.behavior.ScrannelQuack;

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
		//动态的修改其特性(以适应新需求)
		greenDuck.setFlyBehavior(new HightFly());
		greenDuck.fly();
		greenDuck.setQuackBehavior(new ScrannelQuack());
		greenDuck.quack();
		
	}

}
