package com.strategy.domain;


public class RedHeadDuck extends Duck {

	@Override
	public void display() {
		System.out.println("---鸭子为红色---");
	}
	//针对飞的特性，红头鸭添加自己的特性
	public void fly(){
		System.out.println("红头鸭子不会飞");
	}

}
