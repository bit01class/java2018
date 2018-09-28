package com.bit.day16;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Ex16 {

	public static void main(String[] args) {
		List<Integer> list1= new ArrayList<Integer>();
		list1.add(1111);
		int su=list1.get(0);
		
		list1=new LinkedList<Integer>();
		list1.add(new Integer(1111));
		
		list1=new Vector<Integer>();
		list1.add(3333);
		list1.add(4444);
		list1.add(5555);
		
		Enumeration<Integer> eles = ((Vector<Integer>)list1).elements();
		while(eles.hasMoreElements()){
			int ele = eles.nextElement();
			System.out.println(ele);
		}
		
		
		Set<String> set1 = new HashSet<String>();
		set1.add("aaaa");
		set1.add("bbbb");
		
		Iterator<String> ite = set1.iterator();
		while(ite.hasNext()){
			String ele = ite.next();
			System.out.println(ele);
		}
		
		
		
		
		

	}

}














