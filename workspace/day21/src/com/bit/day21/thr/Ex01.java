package com.bit.day21.thr;

public class Ex01 extends java.lang.Thread {
	
	@Override
	public void run(){
		String name=getName();
		System.out.println(name+"스레드 시작");
		for(int i=0; i<10; i++){
			System.out.println(name+"실행:"+i);
		}
		System.out.println(name+"스레드 종료");
	}

	public static void main(String[] args) {
		// 스레드
//		Ex01 me0 = new Ex01();
//		String name=me0.getName();
		Thread thr = Thread.currentThread();
		String name=thr.getName();
		
		System.out.println(name+"메인 시작");
		Ex01 me = new Ex01();
		me.start();
		Ex01 me2 = new Ex01();
		me2.start();
		System.out.println(name+"메인 종료");
	}
}

















