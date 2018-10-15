package com.bit.day22.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Ex01 extends Frame{
	
	public Ex01() {
		FlowLayout fl= new FlowLayout();
		GridLayout gr= new GridLayout(1,4);
		GridLayout gr1= new GridLayout(4,1);
		GridLayout gr2= new GridLayout(4,1);
		GridLayout gr3= new GridLayout(4,1);
		GridLayout gr4= new GridLayout(2,1);
		Panel p =new Panel(gr);
		
		Panel p1=new Panel(gr1);
		char[] ch={'7','4','1','0'};
		for(int i=0; i<4; i++){
			Button btn=new Button(ch[i]+"");
			p1.add(btn);
		}
		Panel p2=new Panel(gr2);
		char[] ch2={'8','5','2','.'};
		for(int i=0; i<4; i++){
			Button btn=new Button(ch2[i]+"");
			p2.add(btn);
		}
		Panel p3=new Panel(gr3);
		char[] ch3={'9','6','3','='};
		for(int i=0; i<4; i++){
			Button btn=new Button(ch3[i]+"");
			p3.add(btn);
		}
		Panel p4=new Panel(gr4);
		p4.add(new Button("+"));
		p4.add(new Button("-"));
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		
		add(p);
		setSize(500,400);
		setLocation(1920+200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
