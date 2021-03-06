package com.bit.day16;

// 디자인 패턴 - 팩토리 패턴

class Tico{
	void name(){
		System.out.println("티코");
	}
}

class Sm3{
	void name(){
		System.out.println("sm3");
	}
}

class Factory<T>{
	T car;
	
	void set(T car){
		this.car=car;
	}
	
	T get(){
		return car;
	}
}

class Template{
	
	static <T>Factory<T> getInstence(T car){
		Factory<T> fac = new Factory<T>();
		fac.set(car);
		return fac;
	}
	
}

public class Ex13 {

	public static void main(String[] args) {
		Tico car=new Tico();
		Factory<Tico> fac = Template.<Tico>getInstence(car);
		Tico tico = fac.get();
		tico.name();
	}

}















