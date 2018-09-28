package com.bit.day16;

import java.util.LinkedList;

public class Ex02 {

	public static void main(String[] args) {
		// 큐 (FIFO)
		// 선입선출 - 먼저 IN 먼저 OUT
		// 순서(o) 중복(o)
		java.util.Queue que=new LinkedList();
		que.offer(1111);
		que.offer(2222);
		que.offer(3333);
		que.offer(1111);
		que.offer(4444);
		
		
		while(que.size()>0){
			System.out.println("현재 대기에는 "+que.peek());
			System.out.println(que.poll());
		}
		
	}

}
