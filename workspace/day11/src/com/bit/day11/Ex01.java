package com.bit.day11;

class Car extends Object{
	// �Ӽ����
	// ���
	String company;
	String model;
	String color;
	final int year;
	int speed;	
	
	public Car(int year) {
		super();
		this.year=year;
		model="Ƽ��";
		System.out.println("car ��ü ����");
	}
	
	// ��ɿ��
	// ~ �Ѵ�(����)
	void speedUp(int speed){
		this.speed+=speed;
	}
	void start(){
		System.out.println("�޸���");
	}
	
	void stop(){
		System.out.println("�����");
	}
	
	@Override
	public String toString(){
		return model;
	}
}

public class Ex01 extends Car{
	String model="���";
	
	public Ex01() {
		super(2018);
		System.out.println("ex01 ��ü ����");
	}

	public static void main(String[] args) {

		Ex01 me= new Ex01();
		me.start();
		Car car=new Car(2018);
		System.out.println(car);
		System.out.println(car.toString());
		
	}
	// �������̵�

	@Override
	void start(){
		super.start();
		System.out.println(super.model);
	}
	

}
