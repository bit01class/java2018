package com.bit.day10;

public class Ex01 {

	public static void main(String[] args) {
		// 배열
//		int a, b, c;
//		a=1;
//		a+1=2;
//		a+2=3;
		int[] arr1=new int[10];
//		arr1[0]=2;
//		arr1[1]=4;
//		arr1[2]=6;
		for(int i=0; i<10; i++){
			arr1[i]=(i+1)*2;
		}
		for(int i=0; i<10; i++){
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		
		
		// 배열의 형태
		// 자료형[] 배열명 = new 자료형[갯수];
		// 자료형[] 배열명;
		// 배열명= new 자료형[갯수];
		
		char[] arr2=new char[4];
		arr2[0]='a';
		arr2[1]='b';
		arr2[2]='z';
		arr2[3]='d';
		
//		for(int i=0; i<4; i++){
//			arr2[i]=(char)('a'+i);
//		}
		for(int i=0; i<4; i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
//		char[] arr3=new char[4]{'a','b','z','d'};
		char[] arr3=new char[]{'a','b','z','d'};
		for(int i=0; i<4; i++){
			System.out.println("arr3["+i+"]="+arr3[i]);
		}
		
		char[] arr4={'a','b','z','d'};
		for(int i=0; i<4; i++){
			System.out.println("arr4["+i+"]="+arr4[i]);
		}
	}

}









