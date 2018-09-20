package com.bit.day11;



public class Ex06 {

	public static void main(String[] args) {
		String st0="Spring";
		String st1="Java";
		String st2="Web";
		String st3=st1+st2+st0;
		
		String st4=st1.concat(st2);
		String st5=st1.concat(st2).concat(st0); // Ã¼ÀÌ´× ¹®¹ý
		
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(st5);
	}

}
