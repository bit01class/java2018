package com.bit.day18;

import java.util.Arrays;
import java.util.List;

class Lec01 implements Comparable<Lec01>{
	int su;
	public Lec01(int su) {
		this.su=su;
	}
	@Override
	public int compareTo(Lec01 o) {
		return o.su-this.su;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// Arrays
		int[] arr1=new int[]{1,3,5,7};
		
		System.out.println(Arrays.toString(arr1));
		int[] arr2=Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(arr1.equals(arr2));
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		int[][] obj1=new int[][]{{1},{2}};
		int[][] obj2=new int[][]{{1},{2}};
		System.out.println(obj1.equals(obj2));
		System.out.println(Arrays.equals(obj1, obj2));
		System.out.println(Arrays.deepEquals(obj1, obj2));
		System.out.println("-----------------------------");
		int[] arr3=new int[5];
		Arrays.fill(arr3, 100);
		System.out.println(Arrays.toString(arr3));
		Arrays.fill(arr3, 1, 4, 50);// (target,Ω√¿€index, ≥°, value)
		System.out.println(Arrays.toString(arr3));
		System.out.println("-----------------------------");
		List<String> list = Arrays.asList("ab","a","abcd","abc");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		String[] arr4 = (String[]) list.toArray();
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		System.out.println("-----------------------------");
		int[] arr5= new int[]{10,4,23,12,2};
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));
		
		System.out.println(Arrays.binarySearch(arr5, 23));
		
		System.out.println("-----------------------------");
		Lec01[] arr6=new Lec01[3];
		arr6[0]=new Lec01(5);
		arr6[1]=new Lec01(1);
		arr6[2]=new Lec01(3);
		Arrays.sort(arr6);
//		System.out.println(Arrays.toString(arr6));
		for(int i=0; i<arr6.length; i++){
			Lec01 temp = arr6[i];
			System.out.print(temp.su +" ");
		}
		System.out.println();
	}

}

















