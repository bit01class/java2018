package com.bit.day16;

import java.util.Iterator;
import java.util.TreeSet;

class Com implements Comparable{
	int ver;
	
	public Com(int a) {
		ver=a;
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		return this.ver-((Com)obj).ver;
	}
	
}

public class Ex08 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
//		set.add("efg");
//		set.add("ab");
//		set.add("hijk");
//		set.add("cd");
		set.add(new Com(1));
		set.add(new Com(2));
		set.add(new Com(1));
		set.add(new Com(4));
		
		System.out.println("size:"+set.size());
		
//		Iterator ite = set.iterator();
//		while(ite.hasNext()){
//			System.out.println(ite.next());
//		}

	}

}
