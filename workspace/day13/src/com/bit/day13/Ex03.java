package com.bit.day13;

public class Ex03 {

	public static void main(String[] args) {
		// 예외처리
		int a=2;
		int b=1;
		int c=0;
		try{
			System.out.println("전");
				c=a/b;
			System.out.println("후");
		}catch(java.lang.ArithmeticException e){
			System.out.println("에러를 피했음");
		}
		System.out.println(c);
	}

}
