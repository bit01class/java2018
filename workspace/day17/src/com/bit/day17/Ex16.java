package com.bit.day17;

import java.util.Random;

public class Ex16 {

	public static void main(String[] args) {
		// Math
		System.out.println(Math.random());// 0<= , <1
		
		///////////////////////////////
		java.util.Random ran=new Random();
		System.out.println(ran.nextInt());// Integer.MIN_VALUE <= ,<=MAX_VALUE
		System.out.println(ran.nextInt(2));// 0<= ,<1 *ÀÎÀÚ
//		System.out.println(ran.nextBoolean());
//		System.out.println(ran.nextDouble());// 0<= , <1
		
	}

}
