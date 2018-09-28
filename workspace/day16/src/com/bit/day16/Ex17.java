package com.bit.day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex17 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("a", 1111);
		map.put("b", 2222);
		map.put("c", 3333);
		map.put("d", 4444);
		
		map.put("c", 5555);
		
//		map.remove("c");
//		
//		Integer value =0;
//		value=map.get("c");
//		
//		System.out.println(value);
		
		Set<String> keys = map.keySet();
		
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key=ite.next();
			Integer value= map.get(key);
			System.out.println("key:"+key+",value:"+value);
		}

	}

}


















