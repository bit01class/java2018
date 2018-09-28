package com.bit.day16;

import java.util.HashMap;
import java.util.Map;

public class Ex10 {

	public static void main(String[] args) {
		// Map
		// key, value
		// key -> value
		// key 중복불가, 유일키
		// value ~~~;
		
		Map map = new HashMap();
		// 입력
		map.put(null, "value1");
		map.put("bb", "value2");
		map.put(2222, "value3");
		map.put("dd", "value4");
		
		// 수정
		map.put("aa", "edit1");
		
		// 삭제
		map.remove("cc");
		
		// 보기
		System.out.println(map.get(2222));
		System.out.println(map.get(null));
		

	}

}
