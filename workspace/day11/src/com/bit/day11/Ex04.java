package com.bit.day11;

public class Ex04 {

	public static void main(String[] args) {
		// String 문자열클래스
		java.lang.String st1="문자열";
		String st2=new String("생성자의 호출을 통한 문자열 생성");
		System.out.println("st2="+st2);
		
		// ""==null
		String st3=new String();
		System.out.println("st3="+st3);
		String st4=null;
		st4="";
		
		System.out.println(st1+st2);
		System.out.println(1+2+st1+true+1);
		
		String st5="문자열";
		System.out.println(st1==st5);
		String st6=new String("문자열");
		System.out.println("st1과는 "+(st1==st6));
		System.out.println("st1과는 "+(st1.equals(st6)));
		String st7="문자";
		String st8="열";
		String st9=st7+st8;
		System.out.println(st9);
		System.out.println(st8);
		System.out.println(st7);
	}

}






















