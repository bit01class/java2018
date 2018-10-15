package com.bit.day21.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex08 extends Frame{
	
	public Ex08() {
		//FlowLayout fl=new FlowLayout();
		GridLayout gl=new GridLayout(2,2);
		Panel p=new Panel();
		//p.setLayout(fl);
		p.setLayout(gl);
		
		Button btn1=new Button("btn1");
		Button btn2=new Button("btn2");
		Button btn3=new Button("btn3");
		Button btn4=new Button("btn4");
		Button btn5=new Button("btn5");
		
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		
		add(p);
		setSize(500,300);
		setLocation(1920+200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex08();
	}

}
