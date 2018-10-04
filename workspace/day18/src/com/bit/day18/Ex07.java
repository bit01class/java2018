package com.bit.day18;

interface Inter{
	void func();
}

public class Ex07  {
	
	public static Inter func01(){
		
//		class Local implements Inter{
//			public void func(){
//				System.out.println("로컬클래스의 기능");
//			}
//		}
		// 익명클래스
		Inter local = new Inter(){
			public void func(){
				System.out.println("로컬클래스의 기능");
			}
		};
		
		local.func();
		local.func();
		local.func();
		
		return local;
		
//		return new Inter(){
//			public void func(){
//				System.out.println("로컬클래스의 기능");
//			}
//		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter inter=func01();
		inter.func();
	}

}













