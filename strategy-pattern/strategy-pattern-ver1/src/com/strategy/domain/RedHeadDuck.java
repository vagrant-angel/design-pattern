package com.strategy.domain;


public class RedHeadDuck extends Duck {

	@Override
	public void display() {
		System.out.println("---Ѽ��Ϊ��ɫ---");
	}
	//��Էɵ����ԣ���ͷѼ����Լ�������
	public void fly(){
		System.out.println("��ͷѼ�Ӳ����");
	}

}
