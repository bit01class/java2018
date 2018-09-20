package com.bit.day12;

class Car{
	String model;
	
	public Car(String model) {
		this.model=model;
	}
	
	@Override
	public boolean equals(Object obj) {
		return model.equals(((Car)obj).model);
	}
	
	@Override
	public Car clone(){
		return new Car(model);
	}
}

public class Ex01 extends Object{

	public static void main(String[] args) {

		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		boolean result=obj1.equals(obj3); // same object
		System.out.println(result);
		System.out.println(obj1==obj2);
		System.out.println(obj1==obj3);
		System.out.println("----------------------");
		String str1=new String("java");
		String str2=new String("java");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println("----------------------");
		Car mycar1=new Car("Æ¼ÄÚ");
		Car mycar2=new Car("¾Æ¹Ý¶¼");
		System.out.println(mycar1==mycar2);
		System.out.println(mycar1.equals(mycar2));
		Car mycar3=mycar1.clone();
		System.out.println(mycar1.equals(mycar3));
		System.out.println("----------------------");
		System.out.println(obj1);
		System.out.println(obj1.toString());
		int hash=obj1.hashCode();
		System.out.println(hash);
		Ex01 me = new Ex01();
		
		
	}

}



















