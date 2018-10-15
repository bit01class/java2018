package com.bit.day22.ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Ex03 extends Frame {
	
	public Ex03() {
		CardLayout cl=new CardLayout();
		Panel p = new Panel(cl);
		
		Panel p1=new Panel();
		p1.setBackground(Color.BLUE);
		Panel p2=new Panel();
		p2.setBackground(Color.green);
		Panel p3=new Panel();
		p3.setBackground(Color.RED);
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		add(p);
		setBounds(1920+200,200,300,500);
		setVisible(true);
		
		try {
			for(int i=0; i<10; i++){
				Thread.sleep(1000);
				cl.next(p);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Ex03 me = new Ex03();
	}

}


















