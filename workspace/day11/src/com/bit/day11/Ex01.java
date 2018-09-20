package com.bit.day11;

class Car extends Object{
	// 속성요소
	// 명사
	String company;
	String model;
	String color;
	final int year;
	int speed;	
	
	public Car(int year) {
		super();
		this.year=year;
		model="티코";
		System.out.println("car 객체 생성");
	}
	
	// 기능요소
	// ~ 한다(동사)
	void speedUp(int speed){
		this.speed+=speed;
	}
	void start(){
		System.out.println("달린다");
	}
	
	void stop(){
		System.out.println("멈춘다");
	}
	
	@Override
	public String toString(){
		return model;
	}
}

public class Ex01 extends Car{
	String model="모닝";
	
	public Ex01() {
		super(2018);
		System.out.println("ex01 객체 생성");
	}

	public static void main(String[] args) {

		Ex01 me= new Ex01();
		me.start();
		Car car=new Car(2018);
		System.out.println(car);
		System.out.println(car.toString());
		
	}
	// 오버라이드

	@Override
	void start(){
		super.start();
		System.out.println(super.model);
	}
	

}
