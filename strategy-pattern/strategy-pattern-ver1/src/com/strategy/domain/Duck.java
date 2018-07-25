package com.strategy.domain;


public abstract class Duck {
	
	public Duck() {
	}
	public void quack(){
		System.out.println("Ѽ�ӻ��");
	}
	public abstract void display();
	public void fly(){
		System.out.println("Ѽ�ӻ��");
	}
	public void swim(){
		System.out.println("Ѽ�ӻ���Ӿ");
	}
}
