package com.bit.day25;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex01 extends Frame{
	
	public Ex01() {
		Panel p = new Panel(new GridLayout(3,1));
		
		Button btn1= new Button("btn1");
		Button btn2= new Button("btn2");
		
		
		add(p);
		setBounds(1920+100,100,300,300);
		setVisible(true);
		System.out.println(isValid());
		p.add(btn1);
		System.out.println(isValid());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(isValid());
		p.add(btn2);
		p.add(btn1);
		revalidate();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex01();
	}

}








