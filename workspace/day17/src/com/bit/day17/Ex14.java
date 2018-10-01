package com.bit.day17;

import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Ex14 {

	public static void main(String[] args) {
		long time=System.currentTimeMillis();//1970.01.01
		Date dday=new Date(time);
		System.out.println(dday);
		java.io.PrintStream out=System.out;
		java.io.InputStream in=System.in;
		Scanner sc = new Scanner(in);
		Map<String,String> map=System.getenv();
		Set<String> keys=map.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key=ite.next();
			System.out.println(key+"="+map.get(key));
		}
		Properties prop = System.getProperties();
		Enumeration<Object> eles = prop.elements();
		while(eles.hasMoreElements()){
			System.out.println(eles.nextElement());
		}
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.home"));
		
	}

}









