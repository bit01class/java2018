package com.bit.day10;

public class Ex13 {

	public static void main(String[] args) {
		// 배열 값 치환
		int tmp=0;
		int[] arr=new int[]{3,5};
		// {5,3}
		tmp=arr[0];
		arr[0]=arr[1];
		arr[1]=tmp;
		
		System.out.println("["+arr[0]+","+arr[1]+"]");
		
	}

}
