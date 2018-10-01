package com.bit.day17;

import java.util.Calendar;

public class Ex08 {

	public static void main(String[] args) {
		// 날짜 (Calendar)
//		Calender nnow =new Calender();
		java.util.Calendar rightNow = Calendar.getInstance();
//		System.out.println(rightNow.get(1)+"년");
		System.out.println(rightNow.get(Calendar.YEAR)+"년");
//		System.out.println(rightNow.get(2)+1+"월");// 0~11
		System.out.println(rightNow.get(Calendar.MONTH)+1+"월");// 0~11
//		System.out.println(rightNow.get(5)+"일");
		System.out.println(rightNow.get(Calendar.DATE)+"일");
		
//		System.out.println(rightNow.get(Calendar.DAY_OF_WEEK));
		char week=' ';
		switch (rightNow.get(Calendar.DAY_OF_WEEK)) {
		case 1: week='일'; break;
		case 2: week='월'; break;
		case 3: week='화'; break;
		case 4: week='수'; break;
		case 5: week='목'; break;
		case 6: week='금'; break;
		case 7: week='토'; break;
		}
		System.out.println(week);
		
//		System.out.println(rightNow.get(Calendar.AM));// 0 a.m.
//		System.out.println(rightNow.get(Calendar.AM_PM)); // 1 p.m.
		if(rightNow.get(Calendar.AM_PM)==0){
			System.out.println("a.m. ");
		}else{
			System.out.println("p.m. ");
		}
		System.out.println(rightNow.get(Calendar.HOUR)+"시");//12시
		System.out.println(rightNow.get(Calendar.HOUR_OF_DAY)+"시");//24시
		System.out.println(rightNow.get(Calendar.MINUTE)+"분");
		System.out.println(rightNow.get(Calendar.SECOND)+"초");
	}

}

























