package com.bit.day13;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ArithmeticException err=new ArithmeticException();
			throw err;
		}catch(ArithmeticException err){
			System.out.println("에러발생함");
		}
		System.out.println("끝");
	}

}
