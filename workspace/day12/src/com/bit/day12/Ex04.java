package com.bit.day12;

public class Ex04 {

	public static void main(String[] args) {
		// 10진수 정수 래퍼클래스
		byte a=10;
		Byte su1=new Byte(a);
		Byte su2=new Byte("127"); // -128~127
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.SIZE);
		byte b=Byte.parseByte("127");
		System.out.println("----------------------------------");
		short c=111;
		Short su3=new Short(c);
		Short su4=new Short("222");
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.SIZE);
		short d=Short.parseShort("-32768");
		System.out.println(d);
		System.out.println("------------------------------------");
		long e=1234L;
		Long su5=new Long(1234);
		Long su6=new Long(1212L);
		Long su7=new Long("9223372036854775806");
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.SIZE);
		long f=Long.parseLong("9223372036854775807");
		int g=su7.intValue();
		System.out.println(g);
	}

}















