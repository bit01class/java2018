package com.bit.day21.ui;

public class Ex01 extends java.awt.Frame implements Runnable {

	public static void main(String[] args) {
//		Ex01 me = new Ex01();
//		me.setSize(500, 300);
//		me.setLocation(500+1920, 200);
//		me.setVisible(true);
		
		Thread thr=new Thread(new Ex01());
		thr.start();
		thr=new Thread(new Ex01());
		thr.start();
	}

	@Override
	public void run() {
		setSize(500, 300);
		setLocation(500+1920, 200);
		setVisible(true);
	}

}
