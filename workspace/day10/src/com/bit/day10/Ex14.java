package com.bit.day10;

public class Ex14 {

	public static void main(String[] args) {
		// ��������
		int[] arr=new int[]{9,4,5,2,3,6,1};

		//arr[0]~[2]
		int temp=0;
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=i; j<arr.length; j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
//		if(arr[0]>arr[1]){
//			temp=arr[0];
//			arr[0]=arr[1ma];
//			arr[1]=temp;
//		}
//		if(arr[0]>arr[2]){
//			temp=arr[0];
//			arr[0]=arr[2];
//			arr[2]=temp;
//		}
//		if(arr[0]>arr[3]){
//			temp=arr[0];
//			arr[0]=arr[3];
//			arr[3]=temp;
//		}
//		//////////////////////////
//		if(arr[1]>arr[2]){
//			temp=arr[1];
//			arr[1]=arr[2];
//			arr[2]=temp;
//		}
//		if(arr[1]>arr[3]){
//			temp=arr[1];
//			arr[1]=arr[3];
//			arr[3]=temp;
//		}
		
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

}
