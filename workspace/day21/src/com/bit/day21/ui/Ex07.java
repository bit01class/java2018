package com.bit.day21.ui;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.util.Date;

public class Ex07 extends Frame{
	
	public Ex07() {
		Date date=new Date();
		int year=date.getYear();
		int month=date.getMonth();
		int day=date.getDate();
		System.out.println(year);
		System.out.println(month);
		Panel p =new Panel();
		
		Label yla=new Label("³â");
		Label mla=new Label("¿ù");
		Label dla=new Label("ÀÏ");
		Choice ycho=new Choice();
		for(int i=0; i<5; i++){
			ycho.addItem(year+1900-2+i+"");
		}
		ycho.select(year+1900+"");
		Choice mcho=new Choice();
		for(int i=0; i<12; i++){
			mcho.addItem(i+1+"");
		}
		mcho.select(month+1+"");
		Choice dcho=new Choice();
		for(int i=0; i<31; i++){
			dcho.addItem(i+1+"");
		}
		dcho.select(day+"");
		p.add(ycho);
		p.add(yla);
		p.add(mcho);
		p.add(mla);
		p.add(dcho);
		p.add(dla);
		
		add(p);
		setSize(500,200);
		setLocation(1920+500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07();

	}

}
