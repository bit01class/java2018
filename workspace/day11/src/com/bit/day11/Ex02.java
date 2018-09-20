package com.bit.day11;

public class Ex02 extends Object{

	public static void main(String[] args) {
		//int arr0[] =new int[4];
		int[] arr1=new int[4];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		arr1[3]=4;
		int[] arr2=new int[]{1,2,3,4};
		int[] arr3={1,2,3,4};
		
		System.out.println(arr3);
		System.out.println(arr3.toString());
		System.out.println(arr3.length);
		System.out.println(arr3.equals(arr2));
		System.out.println(arr3==arr2);
		System.out.println(Ex02.arrayEquals(arr2, arr3));
		// ���� ����
		//int[] arr4=arr3;
		
		// ���� ����(3)
		//int[] arr4=Ex02.arrayCopy(arr3);
		//int[] arr4=new int[arr3.length];
		//System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		int[] arr4 = arr3.clone();
		
		arr4[1]=5;
		Ex02.arrayShow(arr3);
		Ex02.arrayShow(arr4);
	}
	
	public static void arrayShow(int[] arr){
		System.out.print("[");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
	
	public static int[] arrayCopy(int[] arr){
		int[] copy=new int[arr.length];
		for(int i=0; i<arr.length; i++){
			copy[i]=arr[i];
		}
		return copy;
	}
	
	public static boolean arrayEquals(int[] arr1, int[] arr2){
		boolean result=true;
		if(arr1.length==arr2.length){
			for(int i=0; i<arr1.length; i++){
				if(arr1[i]!=arr2[i]){
					result=false;
				}
			}
		}else{
			result=false;
		}
		return result;
	}

}




















