package com.bit.day21.thr;

public class Ex05 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 시작");
		Ex05 me1 = new Ex05();
		me1.start();
		Ex05 me2=new Ex05();
		me2.start();
		System.out.println("메인 종료");
	}
	
	@Override
	public void run() {
		System.out.println(getName()+"시작");
		try {
			Thread.sleep(1000);// 1초=1000
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+"종료");
	}

}











