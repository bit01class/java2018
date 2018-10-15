package com.bit.day21.ui;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class Ex06 extends Frame {
	
	public Ex06() {
		Panel p =new Panel();
		
		Choice cho=new Choice();
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		//cho.select(1);
		//cho.select("item3");
		p.add(cho);
		
		java.awt.List list=new List(3,true);
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
//		list.add("item5");
		list.select(2);
		p.add(list);
		add(p);
		setSize(800,500);
		setLocation(1920+500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex06();
	}

}




















