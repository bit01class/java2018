package com.bit.day17;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Ex10 {

	public static void main(String[] args) {
		// 
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		java.util.GregorianCalendar gc=new GregorianCalendar(tz);
//		gc.set(2016, 0, 1);
		System.out.println(gc.isLeapYear(gc.get(Calendar.YEAR)));
		System.out.println(gc.get(Calendar.YEAR)+"��");
		System.out.println(gc.get(Calendar.MONTH)+1+"��");
		System.out.println(gc.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.println(gc.get(Calendar.HOUR_OF_DAY)+"��");
		System.out.println(gc.get(Calendar.MINUTE)+"��");
		System.out.println(gc.get(Calendar.SECOND)+"��");
		Date gday = gc.getTime();
		System.out.println(gday);
	}

}
