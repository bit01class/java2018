package com.bit.day23;

public class Ex10 extends Thread {

	@Override
	public void run() {
		while(true){
			System.out.println("실행중...");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Ex10 me =new Ex10();
		me.setDaemon(true);
		me.start();

		try {
			sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main 스레드 끝");
	}

}



























