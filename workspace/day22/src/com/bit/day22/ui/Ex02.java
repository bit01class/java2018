package com.bit.day22.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex02 extends Frame {
	
	public Ex02() {
		BorderLayout bl = new BorderLayout();
		Panel p = new Panel(bl);
		
		Button btn1=new Button("Center");
		Button btn2=new Button("North");
		Button btn3=new Button("South");
		Button btn4=new Button("East");
		Button btn5=new Button("West");
		
		p.add(btn2,BorderLayout.NORTH);
		p.add(btn3,BorderLayout.SOUTH);
		p.add(btn4,BorderLayout.EAST);
		p.add(btn5,BorderLayout.WEST);
		p.add(btn1,BorderLayout.CENTER);
		
		add(p);
		setBounds(1920+200, 200, 500, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}



















