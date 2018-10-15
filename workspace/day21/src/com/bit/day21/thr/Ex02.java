package com.bit.day21.thr;

public class Ex02 implements java.lang.Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex02 me1=new Ex02();
		
		Thread thread = new Thread(me1);
		thread.start();

		thread = new Thread(me1);
		thread.start();
	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();// 최근에 스레드
		String name=thr.getName();
		System.out.println(name+"스레드시작");
		for(int i=0; i<10; i++){
			System.out.println(name+"실행:"+i);
		}
		System.out.println(name+"스레드종료");
	}

}



















