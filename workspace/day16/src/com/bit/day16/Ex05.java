package com.bit.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex05 {

	public static void main(String[] args) {
		// Set (����)
		Set set1=new HashSet();
//		Set set1=new TreeSet();
		
		set1.add(1111);
		set1.add(2222);
		set1.add(3333);
		set1.add(4444);
		set1.add(2222);
		set1.add(2222);
		set1.add(1111);
		set1.add(5555);
		
		
		Iterator ite = set1.iterator();
		System.out.println(set1.size());

//		for(int i=0; i<set1.size(); i++){
//			System.out.println(ite.next());
//		}
		while(ite.hasNext()){
			Integer obj = (Integer)ite.next();
			System.out.println(obj.toString());
		}
		
	}

}



















