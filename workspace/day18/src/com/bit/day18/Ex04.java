package com.bit.day18;

import com.bit.day18.Lec04.Lec44;

/*
 * 클래스의 구성요소
 * 생성자
 * 필드
 * 메서드
 * (내부클래스)
 * 
 */

class Lec04{
	int su1=1111;
	static int su2=2222;

	static class Lec44{
		int su3=3333;
		static int su4=4444;
		public Lec44() {
			System.out.println("new Lec44()");
		}
		
		public void func03(){
			System.out.println("Lec44-func03()");
//			func02();
//			Lec04 outter=new Lec04();
//			outter.func01();
		}
		
		public static void func04(){
			System.out.println("Lec44-func04()");
//			func02();
//			Lec04 outter=new Lec04();
//			outter.func01();
		}
		
	}
	
	public Lec04() {
		System.out.println("new Lec04()");
	}
	
	public void func01(){
		System.out.println("Lec04-func01()");
//		Lec44.func04();
//		System.out.println(Lec44.su4);
//		Lec44 inner=new Lec44();
//		inner.func03();
//		System.out.println(inner.su3);
	}
	public static void func02(){
		System.out.println("Lec04-func02()");
//		Lec44.func04();
//		System.out.println(Lec44.su4);
//		Lec44 inner=new Lec44();
//		inner.func03();
//		System.out.println(inner.su3);
	}
}


public class Ex04 {
	
	
	public static void main(String[] args) {
		// 내부클래스
//		int su=Lec04.Lec44.su4;
//		System.out.println(su);
//		Lec04.Lec44.func04();
//		
		Lec44 inner = new Lec04.Lec44();
		inner.func03();
//		System.out.println(inner.su3);
		/////////////////////////
//		Lec04.func02();
	}

}

















