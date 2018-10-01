package com.bit.day17;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
//		java.util.GregorianCalendar gc=new GregorianCalendar(tz);
		Date dnow=new Date();// 1900/1/1 0:0:0
		long time=dnow.getTime();// 1970/1/1 0:0:0
		Date dday=new Date("1970/01/01 12:30:01");
//		dday.setYear(116);
//		dday.setMonth(11);
//		dday.setDate(30);
//		dday.setHours(13);
//		dday.setMinutes(1);
//		dday.setSeconds(1);
//		System.out.println(dday.getTime());
		System.out.println(dday);
		
		
	}

}
