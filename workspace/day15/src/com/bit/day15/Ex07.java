package com.bit.day15;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex07 {

	public static void main(String[] args) {
		// ArrayList
//		ArrayList list = new ArrayList();
		LinkedList list = new java.util.LinkedList();
		// 추가
		list.add(1111);
		list.add(2222);
		list.add(3.14);
		list.add('a');
		list.add(false);
		list.add("String");
		// 사이에 추가
		list.add(1, 3333);
		// 삭제
		list.remove(3);
		// 수정
		list.set(3, "수정");
		// 보기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println("------------------------------------------------");
		ArrayList list2= new ArrayList();
//		list2.addAll(list);
//		list2.addAll(list);
//		for(int i=0; i<list.size(); i++){
//			list2.add(list.get(i));
//		}
//		list.set(0, "수정");
//		System.out.println(list2.add(1111));
//		System.out.println(list2.add(2222));
//		System.out.println(list2.add(3333));
//		System.out.println(list2.add(1111));
//		System.out.println(list2.add(2222));
		
		//list2.remove(1);
		int target=2222;
		System.out.println(target+"이 존재하냐"+list2.contains(target));
		System.out.println(target+"이 어디있냐"+list2.indexOf(target));
		System.out.println(target+"이 어디있냐"+list2.lastIndexOf(target));
		System.out.println("list2가 비어있냐"+list2.isEmpty());
		
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i));
		}
		
	}

}









































