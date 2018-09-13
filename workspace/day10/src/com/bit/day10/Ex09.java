package com.bit.day10;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars= new Car[3];
		for(int i=0; i<cars.length; i++){
			cars[i]=new Car("내차"+(i+1));
		}
		for(int i=0; i<cars.length; i++){
			System.out.println("------------------------");
			cars[i].show();
			System.out.println("------------------------");
		}
		cars[0].speedUp();

		System.out.println("------------------------");
		for(int i=0; i<cars.length; i++){
			cars[i].show();
		}

		System.out.println("------------------------");
		cars[1].speedUp();
		System.out.println("------------------------");
		for(int i=0; i<cars.length; i++){
			cars[i].show();
		}
		System.out.println("------------------------");
		cars[2].speedUp();
		System.out.println("------------------------");
		for(int i=0; i<cars.length; i++){
			cars[i].show();
		}
		System.out.println("------------------------");
		
	}

}


class Car{
	int speed;
	String name;
	
	public Car(String msg) {
		name=msg;
	}
	
	void speedUp(){
		speed+=10;
		show();
	}
	void show(){
		System.out.println(name+"의 현재속도:"+speed+"km");
	}
}