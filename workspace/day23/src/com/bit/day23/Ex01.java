package com.bit.day23;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01  extends Frame implements Runnable{
	Label la;
	
	public Ex01() {
		Font font = new Font("",Font.BOLD,30);
		la = new Label();
		la.setFont(font);
		la.setAlignment(Label.CENTER);
		add(la);
		setBounds(1920+200,200,500,300);
		setVisible(true);
	}
	
	@Override
	public void run() {
		Thread thr=null;
		while(true){
			Date date=new Date();
//			System.out.println(date);
//			int h=date.getHours();
//			int m=date.getMinutes();
//			int s=date.getSeconds();
			SimpleDateFormat sdf=new SimpleDateFormat();
			sdf.applyPattern("yyyy/MM/dd hh:mm:ss");
			
			la.setText(sdf.format(date));
			try {
				thr=Thread.currentThread();
				thr.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Ex01 me = new Ex01();
		Thread thr= new Thread(me);
		thr.start();
	}

}





