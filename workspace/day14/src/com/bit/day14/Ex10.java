package com.bit.day14;

abstract class Lec10{
	// 추상클래스 - 추상메서드를 0개 이상 갖는 클래스
	// 클래스 선언 앞에 abstract 키워드가 붙으면 추상클래스
	int su;
	
	public Lec10() {
	}
	
	public void func01(){
		System.out.println("Lec10-func01()");
	}
	
	public abstract void func02();// 추상메서드 (abstract)
}


public class Ex10 extends Lec10 {
	
	@Override
	public void func02(){
		System.out.println("내가 오버라이드한 func02()");
	}

	public static void main(String[] args) {
		// 추상클래스
		Ex10 me = new Ex10();
		me.func01();
		me.func02();
		
		Lec10 you=new Ex10();
		you.func01();
		you.func02();
	}

}















