package com.bit.day11;

public class Ex08 {

	public static void main(String[] args) {
		// String 클래스의 기능
		String st1="java".concat("Web");
		System.out.println(st1);
		System.out.println("문자열 길이:"+st1.length());
		System.out.println("문자열 길이:"+"abcd".length());
		System.out.println("빈문자인가:"+st1.isEmpty());
		System.out.println("빈문자인가:"+"".isEmpty());
		System.out.println("빈문자인가:"+" ".isEmpty());
		System.out.println("-----------------------------------------");
		String st2="java";
		char[] ch=new char[]{};
		String st3=new String(ch);
		System.out.println("빈문자인가:"+st3.isEmpty());
		String st4=new String(st2);
		System.out.println(st4);

		char[] chs=new char[4];
		chs[0]='j';
		chs[1]='a';
		chs[2]='v';
		chs[3]='a';
		String st5=new String(chs);
		System.out.println(st5);
		System.out.println("-----------------------------------------");
		String st6="java";
		char[] ch2=st6.toCharArray();
		for(int i=0; i<ch2.length; i++){
			System.out.println(ch2[i]);
		}
		System.out.println(st6.length()==ch2.length);
		String st7="ABCDEFGHIJKLMN";
		char[] ch3=st7.toCharArray();
		System.out.println(ch3[2]);
		char ch4=st7.charAt(3);
		System.out.println(ch4);
		char[] ch5=new char[st7.length()];
		for(int i=0; i<st7.length(); i++){
			ch5[i]=st7.charAt(i);
		}
		String st8=new String(ch5);
		System.out.println(st8);
	}

}













