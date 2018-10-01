package com.bit.day17;

public class Ex04 {

	public static void main(String[] args) {
		// String
		//StringBuilder
		//StringBuffer
		String temp1="java";

//		for(int i=0; i<1000; i++){
//			temp+=i;
//		}
		System.out.println(temp1+"1234");
		System.out.println(temp1);
		System.out.println("----------------------------------------------");
		
		java.lang.StringBuffer str1=new StringBuffer("abcd");
//		StringBuffer str2="1234";
		StringBuffer str2=new StringBuffer("1234");
		StringBuffer str4=new StringBuffer(str2);
		
//		System.out.println(str1+str2);
		System.out.println(str1.append(str2));
		System.out.println(str1);
		System.out.println("----------------------------------------------");
		StringBuffer str3=new StringBuffer("java");
//		for(int i=0; i<13; i++){
//			str3.append("a");
//		}
//		str3.trimToSize();
		System.out.println("msg:"+str3);
		System.out.println("length:"+str3.length());
		System.out.println("capacity:"+str3.capacity());
		
		
	}

}


















