package com.bit.day17;

import java.util.Calendar;

public class Ex08 {

	public static void main(String[] args) {
		// ��¥ (Calendar)
//		Calender nnow =new Calender();
		java.util.Calendar rightNow = Calendar.getInstance();
//		System.out.println(rightNow.get(1)+"��");
		System.out.println(rightNow.get(Calendar.YEAR)+"��");
//		System.out.println(rightNow.get(2)+1+"��");// 0~11
		System.out.println(rightNow.get(Calendar.MONTH)+1+"��");// 0~11
//		System.out.println(rightNow.get(5)+"��");
		System.out.println(rightNow.get(Calendar.DATE)+"��");
		
//		System.out.println(rightNow.get(Calendar.DAY_OF_WEEK));
		char week=' ';
		switch (rightNow.get(Calendar.DAY_OF_WEEK)) {
		case 1: week='��'; break;
		case 2: week='��'; break;
		case 3: week='ȭ'; break;
		case 4: week='��'; break;
		case 5: week='��'; break;
		case 6: week='��'; break;
		case 7: week='��'; break;
		}
		System.out.println(week);
		
//		System.out.println(rightNow.get(Calendar.AM));// 0 a.m.
//		System.out.println(rightNow.get(Calendar.AM_PM)); // 1 p.m.
		if(rightNow.get(Calendar.AM_PM)==0){
			System.out.println("a.m. ");
		}else{
			System.out.println("p.m. ");
		}
		System.out.println(rightNow.get(Calendar.HOUR)+"��");//12��
		System.out.println(rightNow.get(Calendar.HOUR_OF_DAY)+"��");//24��
		System.out.println(rightNow.get(Calendar.MINUTE)+"��");
		System.out.println(rightNow.get(Calendar.SECOND)+"��");
	}

}

























