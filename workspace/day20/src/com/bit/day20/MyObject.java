package com.bit.day20;

public class MyObject implements java.io.Serializable{//����ȭ
	public static final long serialVersionUID=2L;
	transient public int su=1234;
	transient public String name="�Ǵٸ���ü";
	
	
	public MyObject() {
		
	}
	
	public void func01(){
		System.out.println("MyObject-func01...");
	}
	
	void func02(){
		System.out.println("MyObject-func02...");
	}
	
}
