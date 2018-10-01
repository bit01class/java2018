package com.bit.day17;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		java.io.InputStream is=System.in;
		Scanner sc = new Scanner(is);
		System.out.println("숫자입력");
		int input2=sc.nextInt();
		System.out.println(input2);
		sc = new Scanner(is);
		System.out.println("문자입력");
		String input1=sc.nextLine();
		System.out.println(input1);
		sc = new Scanner(is);
		System.out.println("문자입력");
		String input3=sc.next();
		String input4=sc.next();
		System.out.println(input3);
		System.out.println(input4);
		
	}

}
