package com.bit.day13;

public class Ex04 {

	public static void main(String[] args) {
		int[] arr={-2,-1,0,1,2};
		int result=0;
		
			for(int i=0; i<6; i++){
//				try{
//					try{
//						result=10/arr[i];
//					}catch(ArithmeticException e){
//						result=0;
//					}
//					System.out.println(10+"/"+arr[i]+"="+result);
//				}catch(ArrayIndexOutOfBoundsException e){
//					
//				}
				try{
					result=10/arr[i];
					System.out.println(10+"/"+arr[i]+"="+result);
				}catch(ArithmeticException e){
					result=0;
				}catch(ArrayIndexOutOfBoundsException e){
					
				}
			}
			
			
	}
}
