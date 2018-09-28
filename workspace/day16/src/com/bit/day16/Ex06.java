package com.bit.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex06 {

	public static void main(String[] args) {
		// Lotto
		
		int ran=0;
		Set lotto = new TreeSet();
		while(lotto.size()<6){
			ran=(int)(Math.random()*45)+1;
			lotto.add(ran);
		}
		
		Iterator ite = lotto.iterator();
		while(ite.hasNext()){
			System.out.print(ite.next()+" ");
		}
	}

}
