package com.bit.day23;

import java.awt.Frame;
import java.awt.Label;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 extends Thread {
	static Label la;
	
	@Override
	public void run() {
		while(true){
			Date date= new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
			la.setText(sdf.format(date));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Frame f=new Frame();
		la =new Label();
		f.add(la);
		f.setBounds(1920+200,200,400,300);
		f.setVisible(true);
		Ex02 me =new Ex02();
		me.start();
	}

}














