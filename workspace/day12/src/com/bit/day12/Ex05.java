package com.bit.day12;

public class Ex05 {

	public static void main(String[] args) {
		// 실수 래퍼 클래스
		double a=3.14;
		Double su1=new Double(3.14);
		Double su2=new Double("3.14");
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.SIZE);
		
		double b=Double.parseDouble("3.14");
		Double c=Double.valueOf("3.14");
		System.out.println("---------------------------------------");
		Double su3=3.0/0;
		Double su4=0.0/0;
		Double su5=2.0/2;
		System.out.println(Double.isNaN(su3));
		System.out.println(Double.isNaN(su4));
		System.out.println(Double.isNaN(su5));
		System.out.println(Double.isInfinite(su3));
		System.out.println(Double.isInfinite(su4));
		System.out.println(Double.isInfinite(su5));
		System.out.println(Double.NaN);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println("----------------------------------------");
		float su6=3.14F;
		Float su7=new Float(3.14);
		Float su8=new Float(su6);
		Float su9=new Float("3.14");
		
	}

}










