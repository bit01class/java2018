package com.bit.day16;

import java.util.LinkedList;

public class Ex02 {

	public static void main(String[] args) {
		// ť (FIFO)
		// ���Լ��� - ���� IN ���� OUT
		// ����(o) �ߺ�(o)
		java.util.Queue que=new LinkedList();
		que.offer(1111);
		que.offer(2222);
		que.offer(3333);
		que.offer(1111);
		que.offer(4444);
		
		
		while(que.size()>0){
			System.out.println("���� ��⿡�� "+que.peek());
			System.out.println(que.poll());
		}
		
	}

}
