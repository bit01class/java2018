package com.bit.day10;

public class Ex05 {

	public static void main(String[] args) {
		int cnt='z'-'a'+1;
		char[] arr1 = new char[cnt];
		char[] arr2 = new char[cnt];
		
		for(int i=0; i<cnt; i++){
			arr1[i]=(char)('A'+i);
			arr2[i]=(char)('a'+i);
		}
		
		for(int i=0; i<cnt; i++){
			System.out.print(arr1[i]+":"+arr2[i]+" ");
		}

	}

}
