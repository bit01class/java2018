package com.bit.day18;

abstract class Lec88{
	public void func01(){
		System.out.println("구현된 메서드");
	}
	public abstract void func02();
}

public class Ex08 {
	
	interface Lec08{
		public void func();
	}
	
	
	Lec08 me=new Lec08(){
		
		@Override
		public void func() {
			System.out.println("기능");
		}
	};

	public static void main(String[] args) {
		// 익명클래스
//		Ex08 you=new Ex08(); 
//		you.me.func();
		
		Lec88 ex1=new Lec88(){
			@Override
			public void func02() {
				System.out.println("내가 정의함");
			}
		};
		
		ex1.func01();
		ex1.func02();
		
		Ex08 ex2=new Ex08(){
			@Override
			public void func4() {
				super.func4();
				System.out.println("익명클래스에서 재정의함");
			}
		};
		ex2.func4();
		
		
//		Lec08 me=()->{System.out.println("람다식으로 출력");};
//		me.func();
	}
	
	public void func4(){
		System.out.println("내기능");
	}

}















