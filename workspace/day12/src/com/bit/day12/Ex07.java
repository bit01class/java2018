package com.bit.day12;

public class Ex07 {

	public static void main(String[] args) {
		// 문자 래퍼클래스
		char a='A';
		Character ch1=new Character('A');
		System.out.println((int)Character.MIN_VALUE);// \ u 0000
		System.out.println((int)Character.MAX_VALUE);// \ u ffff
		System.out.println(Character.SIZE);
		
		System.out.println(ch1.charValue());
		System.out.println(ch1.toString());
		Character ch2=Character.valueOf('z');
		
		System.out.println("-----------------------------------------");
		char target=' ';
		System.out.println("유니코드인지"+Character.isDefined(target));
		System.out.println("숫자인지"+Character.isDigit(target));
		System.out.println("레터인지"+Character.isAlphabetic(64));
		System.out.println("레터인지"+Character.isLetter(64));
		System.out.println("대문자인지"+Character.isUpperCase(target));
		System.out.println("소문자인지"+Character.isLowerCase(target));
		System.out.println("띄어쓰기인지"+Character.isSpace(target));
		System.out.println("띄어쓰기인지"+Character.isWhitespace(target));
	}

}

















