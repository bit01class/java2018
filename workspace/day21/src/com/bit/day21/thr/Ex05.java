package com.bit.day21.thr;

public class Ex05 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ����");
		Ex05 me1 = new Ex05();
		me1.start();
		Ex05 me2=new Ex05();
		me2.start();
		System.out.println("���� ����");
	}
	
	@Override
	public void run() {
		System.out.println(getName()+"����");
		try {
			Thread.sleep(1000);// 1��=1000
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+"����");
	}

}











