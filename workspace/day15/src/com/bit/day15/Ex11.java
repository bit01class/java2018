package com.bit.day15;

import java.util.Vector;

public class Ex11 {

	public static void main(String[] args) {
		// vector
		java.util.Vector vec1=new Vector();
		// 입력
		vec1.addElement(1111);
		vec1.addElement(2222);
		vec1.addElement(3333);
		vec1.addElement(4444);
		
		//remove
//		vec1.removeElementAt(2);
//		vec1.removeElement(2222);
		
		// set
		vec1.setElementAt(5555, 2);
		
		// 중간에 삽입
		vec1.insertElementAt(6666, 1);
		
		//removeAll
		vec1.removeAllElements();
		
//		System.out.println(vec1.size());
		
//		System.out.println(vec1.elementAt(0));
//		System.out.println(vec1.elementAt(1));
//		System.out.println(vec1.elementAt(2));
//		System.out.println(vec1.elementAt(3));
		System.out.println("----------------------------------");
		java.util.Enumeration ele=vec1.elements();
		while(ele.hasMoreElements()){
			System.out.println(ele.nextElement());
		}
//		System.out.println(ele.hasMoreElements());
//		System.out.println(ele.nextElement());
//		System.out.println(ele.hasMoreElements());
//		System.out.println(ele.nextElement());
//		System.out.println(ele.hasMoreElements());
//		System.out.println(ele.nextElement());
//		System.out.println(ele.hasMoreElements());
//		System.out.println(ele.nextElement());
//		System.out.println(ele.hasMoreElements());
		
	}

}













