package com.bit.day23;

public class Ex08 extends Thread {

	@Override
	public void run() {
		System.out.println(getName()+"스레드 시작");
		func01();
		System.out.println(getName()+"스레드 종료");
	}
	
	public synchronized void func01(){
		System.out.println(getName()+"잠시 쉬고 있겠습니다");
		try {
			wait();// 	blocked 상태
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	// p.672
	public synchronized void func02(){
		notify();	// 	blocked 상태 중, 하나를 runnable
		notifyAll();	// 	blocked 상태 모두를 runnable
	}
	
	public static void main(String[] args) throws InterruptedException {
		Ex08 me =new Ex08();
		Ex08 me2 =new Ex08();

		me.start();
		me2.start();
		sleep(3000);
		me.func02();
	}

}
















