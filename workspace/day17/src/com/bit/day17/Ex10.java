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
		System.out.println(gc.get(Calendar.YEAR)+"년");
		System.out.println(gc.get(Calendar.MONTH)+1+"월");
		System.out.println(gc.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println(gc.get(Calendar.HOUR_OF_DAY)+"시");
		System.out.println(gc.get(Calendar.MINUTE)+"분");
		System.out.println(gc.get(Calendar.SECOND)+"초");
		Date gday = gc.getTime();
		System.out.println(gday);
	}

}
