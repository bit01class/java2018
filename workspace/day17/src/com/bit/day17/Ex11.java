package com.bit.day17;

import java.util.Date;
import java.util.LinkedList;

public class Ex11 {

	public static void main(String[] args) {
		// 날짜 (Date)
		java.util.Date mday=new Date();
		
		System.out.println(mday);
		LinkedList list= new LinkedList<>();
		for(int i=0; i<10000000; i++){
			list.add(i);
		}
		mday=new Date();
		System.out.println(mday);
//		System.out.println(mday.getYear()+1900+"년");
//		System.out.println(mday.getMonth()+1+"월");
//		System.out.println(mday.getDate()+"일");
//		System.out.println(mday.getHours()+"시");
//		System.out.println(mday.getMinutes()+"분");
//		System.out.println(mday.getSeconds()+"초");

	}

}
