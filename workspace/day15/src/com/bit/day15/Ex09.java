package com.bit.day15;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex09 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();// 일반 read
		LinkedList list2= new LinkedList();// 특수한경우 create update delete
		int limit=10000000;
		long time1, time2,start,end;
		
		start = System.currentTimeMillis();// 시간을 long반환 1/1000초
		for(int i=0; i<limit; i++){
			list1.add(i);
		}
		end = System.currentTimeMillis();
		time1=end-start;
		
//		start = System.currentTimeMillis();
//		for(int i=0; i<limit; i++){
//			list2.add(i);
//		}
//		end = System.currentTimeMillis();
//		time2=end-start;
		
		
		System.out.println("ArrayList:"+time1);
//		System.out.println("LinkedList:"+time2);
		
		
		
	}

}

















