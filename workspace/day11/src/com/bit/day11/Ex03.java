package com.bit.day11;

public class Ex03 {

	public static void main(String[] args) {
		// 
		int[] arr1=new int[]{1,2,3};
		int[] arr2=new int[]{4,5,6};
		int[] arr3={7,8,9};
		
		int[][] arr4=new int[][]{arr1,arr2,arr3};
		int[][] arr5=new int[][]{new int[]{1,2,3},new int[]{4,5,6},new int[]{7,8,9}};
		int[][] arr6=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr7={{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] arr10=new int[3][];
		int[][] arr11=new int[][]{null,null,null};
		
		for(int i=0; i<arr10.length; i++){
			System.out.println(arr10[i]);
		}
		
		int[][] arr12=new int[3][2];
		int[][] arr13=new int[][]{new int[2],new int[2],new int[2]};
		
		arr13[1]=new int[3];

		for(int i=0; i<arr13.length; i++){
			for(int j=0; j<arr13[i].length; j++){
				System.out.print(arr13[i][j]+" ");
			}
			System.out.println();
		}
	}

}












