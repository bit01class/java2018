package com.bit.day23;

public class Ex03 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println(getName()+"스레드 활동중...");
			
		}
	}

	public static void main(String[] args) {
		// 스레드 우선순위
		// 		1 < 5 <10
		Ex03 me = new Ex03();
		Ex03 you =new Ex03();
		Ex03 you2 =new Ex03();
		me.setPriority(MAX_PRIORITY);//10
		you.setPriority(NORM_PRIORITY);//5
		you2.setPriority(MIN_PRIORITY);//1
		me.start();
		you.start();
		you2.start();
		System.out.println(me.getPriority());
		System.out.println(you.getPriority());
		System.out.println(you2.getPriority());
	}

}


















