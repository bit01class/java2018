package com.bit.day13;

public class Ex05 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int su=0;
		while(true){
			try{
				System.out.print("�Է�>");
				su=sc.nextInt();
				System.out.println(su+"+"+10+"="+(su+10));
			}catch(java.util.InputMismatchException e){
				sc = new java.util.Scanner(System.in);
			}
		}
	}

}
