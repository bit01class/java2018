package com.bit.day16;

import java.util.ArrayList;

public class Ex11 {

	public static void main(String[] args) {
		// ���׸� 1.4(5)~
		ArrayList list1 = new ArrayList();
		list1.add("1111");
		list1.add("3.14");
		list1.add("aaa");
		list1.add("a");
		
		for(int i=0; i<list1.size(); i++){
			String obj = (String) list1.get(i);
			System.out.println(obj);
		}
		System.out.println("----------------------------------------------");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("1111");
		list2.add("2222");
		list2.add("3.14");
		
		for(int i=0; i<list2.size(); i++){
			String obj = list2.get(i);
			System.out.println(obj);
		}
		
	}

}




































