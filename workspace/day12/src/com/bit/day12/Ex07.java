package com.bit.day12;

public class Ex07 {

	public static void main(String[] args) {
		// ���� ����Ŭ����
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
		System.out.println("�����ڵ�����"+Character.isDefined(target));
		System.out.println("��������"+Character.isDigit(target));
		System.out.println("��������"+Character.isAlphabetic(64));
		System.out.println("��������"+Character.isLetter(64));
		System.out.println("�빮������"+Character.isUpperCase(target));
		System.out.println("�ҹ�������"+Character.isLowerCase(target));
		System.out.println("��������"+Character.isSpace(target));
		System.out.println("��������"+Character.isWhitespace(target));
	}

}
















