package com.bit.day17;

import java.util.Calendar;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("����"+cal.get(Calendar.WEEK_OF_MONTH)+"����");
		System.out.println("����"+cal.get(Calendar.WEEK_OF_YEAR)+"����");
		
		Calendar cal2=Calendar.getInstance();
		cal2.set(2018, 8-1, 30);
		System.out.println(cal2.get(Calendar.DAY_OF_YEAR));
		System.out.println("����"+cal2.get(Calendar.WEEK_OF_MONTH)+"����");
		System.out.println("����"+cal2.get(Calendar.WEEK_OF_YEAR)+"����");
		System.out.println("---------------------------------------------");
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)-cal2.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)-cal2.get(Calendar.WEEK_OF_YEAR));
		
	}

}
