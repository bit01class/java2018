package com.bit.day13;

class MyException extends Exception{
	public MyException() {
		super("/ by one");
	}
}

public class Ex13 {

	public static void main(String[] args) {
		// 
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int result=0;
		int su=0;
		su=sc.nextInt();
		try{
			if(su==1){
				MyException err=new MyException();
				throw err;
			}
			result=10/su;
			System.out.println("10/"+su+"="+result);
		}catch(java.lang.ArithmeticException e){
			System.out.println("0으로 나눌수 없습니다");
			System.out.println(e.getMessage());
		}catch(com.bit.day13.MyException ex){
			System.out.println("1으로 나눈다는 것은 뻔한 결과입니다");
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
			ex.printStackTrace();
		}
	}

}









