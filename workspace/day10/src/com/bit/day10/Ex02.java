package com.bit.day10;

public class Ex02 {

	public static void main(String[] args) {
		// 1~10까지 중 홀수만 출력
		for(int i=1; i<=10; i+=2){
			System.out.print(i);
		}
		System.out.println();
		for(int i=1; i<=10; i++){
			if(i%2==1)System.out.print(i);
		}
		System.out.println();
		for(int i=1; i<=10; i++){
			if(i%2==0){continue;}
			System.out.print(i);
		}
		System.out.println();
		int[] arr1=new int[10];
		for(int i=0; i<10; i++){
			arr1[i]=i+1;
		}
		for(int i=0; i<10; i+=2){
			System.out.print(arr1[i]);
		}
		System.out.println();
		int[] arr2=new int[5];
		for(int i=0; i<5; i++){
			arr2[i]=1+2*i;
		}
		for(int i=0; i<5; i++){
			System.out.print(arr2[i]);
		}
	}

}
