package com.bit.day13;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=0;
		
		int c=0;
		try{
		System.out.println("12line 문제 없음");
		c=func01(a,b);
		System.out.println("14line 문제 없음");
		}catch(java.lang.ArithmeticException e){
			System.out.println("ArithmeticException");
		}
		System.out.println(a+"/"+b+"="+c);
	}
	
	public static int func01(int a, int b) throws ArithmeticException{
		if(b==0){
			ArithmeticException err=new ArithmeticException();
			throw err;
		}
		int c;
		c=0;
		//try{
		System.out.println("25line 문제 없음");
			c=a/b;
//		}catch(java.lang.ArithmeticException e){
			System.out.println("28line 문제 없음");
//			
//		}
		return c;
	}

}















