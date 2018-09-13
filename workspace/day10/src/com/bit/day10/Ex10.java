package com.bit.day10;

public class Ex10 {

	public static void main(String[] args) {
		// 배열의 복사 비교
		int[] arr1 = new int[]{1,3,5,7,9};
		int[] arr2 = new int[]{1,3,5,7};
		// 주소값비교
		System.out.println(arr1==arr2);
		// 값비교
		boolean result=true;
		if(arr1.length==arr2.length){
			for(int i=0; i<arr1.length; i++){
				if(arr1[i]!=arr2[i]){result=false;}
			}
		}else{
			result=false;
		}
		
		System.out.println("arr1과 arr2는 같다("+result+")");
		System.out.println("\n---------------------------------\n");
		int[] arr3=new int[]{2,4,6,8,10};
		//배열의 옅은 복사
		//int[] arr4=arr3;
		//배열의 깊은 복사(1)
//		int[] arr4=new int[arr3.length];
//		for(int i=0; i<arr3.length;i++){
//			arr4[i]=arr3[i];
//		}
		//배열의 깊은 복사(2)
		//int[] arr4=new int[arr3.length];
		//System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		// System.arraycopy(원본배열, 원본배열의 시작위치, 대상, 대상의 시작위치, 몇개);
		
		int[] arr4=new int[3];
		System.arraycopy(arr3, 1, arr4, 0, 3);
		//arr4[2]=10;
		
		System.out.print("[");
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i]+" ");
		}
		System.out.println("]");
		
		System.out.print("[");
		for(int i=0; i<arr4.length; i++){
			System.out.print(arr4[i]+" ");
		}
		System.out.println("]");
		
	}

}























