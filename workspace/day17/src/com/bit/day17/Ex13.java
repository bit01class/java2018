package com.bit.day17;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex13 {

	public static void main(String[] args) {
		Date dnow = new Date(); //"1970/01/01 12:30:01"
//		System.out.println(dnow);
		java.text.DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,java.util.Locale.US);
		System.out.println(df.format(dnow));
		System.out.println("---------------------------------------------");
		String aPattern ="YY/M/d h:m:s";
		java.text.SimpleDateFormat sdf=new SimpleDateFormat(aPattern);
		System.out.println(sdf.format(dnow));
	}

}
