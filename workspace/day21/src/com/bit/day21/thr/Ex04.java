package com.bit.day21.thr;

public class Ex04 implements Runnable {

	public static void main(String[] args) {
		Ex04 me =new Ex04();
		Thread thr1=new Thread(me,"ù��°");
		thr1.start();
		thr1=new Thread(me,"�ι�°");
		thr1.start();
		thr1=new Thread(me);
		thr1.setName("����°");
		thr1.start();
	}

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println(name+"������");
	}

}





















