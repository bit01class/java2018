package com.bit.day15;

class stu01{// final 상속불가
	int su; // final 상수형 변수
	
	public void func01(){ // final 오버라이드안됨
		System.out.println("stu01-func01()...");
	}
}

abstract class Lec01{
	int su;
	
	public Lec01() {
		// TODO Auto-generated constructor stub
	}
	
	public void func01(){
		System.out.println("추상클래스의 func01()");
		int su=func02();
		System.out.println(su+1000);
	}
	
	public abstract int func02();
	
}

public class Ex01 extends stu01{
	
	@Override
	public void func01(){
		
	}

	public static void main(String[] args) {
		// 상속
//		Lec01 lec=new Lec01();
		Ex01 me = new Ex01();
		me.func01();
	}

}









