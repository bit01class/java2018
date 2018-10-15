package com.bit.day20;

public class MyObject implements java.io.Serializable{//직렬화
	public static final long serialVersionUID=2L;
	transient public int su=1234;
	transient public String name="또다른객체";
	
	
	public MyObject() {
		
	}
	
	public void func01(){
		System.out.println("MyObject-func01...");
	}
	
	void func02(){
		System.out.println("MyObject-func02...");
	}
	
}
