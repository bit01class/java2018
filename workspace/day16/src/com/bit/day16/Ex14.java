package com.bit.day16;

import java.util.HashMap;
import java.util.Map;

class Lec14<T,E>{
	T a;
	E b;
	
	public void set(T a, E b){
		this.a=a;
		this.b=b;
	}
	
}

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("aa", 11111);
//		map.put(111, "bb");
//		map.put("bbb", 1111);
		map.put("cc", null);
		map.put(null, 22222222);
		
	}

}

















