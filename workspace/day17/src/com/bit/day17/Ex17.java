package com.bit.day17;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,3,5,7,9};
		
		System.out.println(java.util.Arrays.toString(arr1));
		
		//±Ì¿∫ ∫πªÁ
//		int[] arr2=new int[arr1.length];
//		for(int i=0; i<arr1.length; i++){
//			arr2[i]=arr1[i];
//		}
//		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		int[] arr2=java.util.Arrays.copyOf(arr1, arr1.length);

		System.out.println(java.util.Arrays.toString(arr2));
	}

}















