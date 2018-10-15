package com.bit.day21.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex03 extends Frame{
	
	public Ex03() {
		java.awt.Button btn1=new Button("버튼1");
		Button btn2=new Button("버튼2");
		Button btn3=new Button("버튼3");
		
		Panel pn=new Panel();
		pn.add(btn1);
		pn.add(btn3);
		pn.add(btn2);
		
		add(pn);
		setSize(300,200);
		setLocation(1920+500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
