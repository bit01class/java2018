package com.bit.day10;

public class Ex11 {

	public static void main(String[] args) {
		// ���� �迭
		//int[] arr1=new int[]{1,2,3};
		int[] arr1=new int[3];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		int[] arr2=new int[]{4,5,6};
		int[] arr3=new int[]{7,8,9};
		
		int[][] arrs1=new int[][]{arr1,arr2,arr3};
		
		for(int i=0; i<arrs1.length; i++){
			//arrs1[i]
			System.out.print("[");
			for(int j=0; j<arrs1[i].length; j++){
				System.out.print(arrs1[i][j]+" ");
			}
			System.out.println("]");
		}
		System.out.println("----------------------------");
		int[][] arrs2=new int[3][2];
//		arrs2[0]=new int[]{1};
//		arrs2[1]=new int[]{2,3};
//		arrs2[2]=new int[]{3,4,5};
		
		for(int i=0; i<arrs2.length; i++){
			//arrs1[i]
			System.out.print("[");
			for(int j=0; j<arrs2[i].length; j++){
				System.out.print(arrs2[i][j]+" ");
			}
			System.out.println("]");
		}

	}

}
















