package com.bit.day22.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex06 extends Frame{

	public Ex06() {
		// 절대좌표
		//484
		//462
		
		Panel p = new Panel(null);
//		setLayout(null);
		Button btn=new Button("버튼");
		btn.setLocation(484-50, 462-50);
		btn.setSize(50,50);
		p.add(btn);
//		btn.setVisible(false);
		btn.setEnabled(true);
		
		add(p);
		setBounds(1920+200,200,500,500);
		setVisible(true);
		System.out.println(p.getWidth());
		System.out.println(p.getHeight());
		this.setResizable(false);
	}
	
	public static void main(String[] args) {
		new Ex06();
	}

}
