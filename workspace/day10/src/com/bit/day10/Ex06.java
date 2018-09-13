package com.bit.day10;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,4,8,16,32};
		
		System.out.println("arr size="+arr.length);
		
		int[] arr100=new int[20];
		for(int i=0; i<arr100.length;i++){
			arr100[i]=i+1;
		}
		
		for(int i=0; i<arr100.length; i++){
			System.out.print(arr100[i]+" ");
		}
	}

}
