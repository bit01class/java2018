package com.bit.day21.ui;

import java.awt.Frame;

public class Ex02 extends Thread{
	
	@Override
	public void run() {
		boolean view=true;
		Frame f=new Frame();
		f.setSize(300, 200);
		f.setLocation(1920+500, 200);
		f.setVisible(view);
		for(int i=0; i<10; i++){
			view=!view;
			f.setVisible(view);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Ex02 me = new Ex02();
		me.start();
	}

}
