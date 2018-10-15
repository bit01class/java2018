package com.bit.day23;

public class Ex06 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(getName()+"스레드 work...");
		}
	}

	public static void main(String[] args) {
		System.out.println("main 스레드 start...");
		Ex06 thr1=new Ex06();
		Ex06 thr2=new Ex06();
		thr1.start();
		thr2.start();
		try {
			thr1.join();
//			thr2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main 스레드 end...");
	}

}

































