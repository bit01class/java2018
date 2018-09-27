package com.bit.day15;

class Lec03 implements Inter05{
	public void func05(){
		System.out.println("func05 run....");
	}
}

public class Ex03 extends Lec03 implements Inter03, Inter05{
	// 인터페이스를 상속받는 클래스는 implements
	// 인터페이스의 상속은 다중상속 허용함
	//
	// 분업
	// 다중상속
	// ...

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03 me = new Ex03();
		
		((Lec03)me).func05();
	}

	@Override
	public void func04() {
		// TODO Auto-generated method stub
		System.out.println("func04 run....");
	}
}
