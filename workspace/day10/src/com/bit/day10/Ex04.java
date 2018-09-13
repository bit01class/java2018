package com.bit.day10;

public class Ex04 {

	public static void main(String[] args) {
		int cnt='z'-'a'+1;
		
		char[] arr1=new char[cnt*2];
		
		for(int i=0; i<cnt*2; i++){
			if(i%2==0){// 0,2,4,... -> 0/2, 2/2, 4/2, 6/2 ...
				arr1[i]=(char)('A'+i/2);
			}else{// 1,3,5,... -> (1-1)/2, (3-1)/2, (5-1)/2,...
				arr1[i]=(char)('a'+(i-1)/2);
			}
		}
		
		for(int i=0; i<cnt*2; i++){
			System.out.print(arr1[i]);
		}

	}

}
