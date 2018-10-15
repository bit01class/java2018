package com.bit.day23.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex08 extends Frame{

	public Ex08() {
		Panel p=new  Panel();

		Button btn1=new Button("버튼1");
		btn1.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("버튼1 클릭");
			}
		});
		p.add(btn1);
		Button btn2=new Button("버튼2");
		btn2.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("버튼2 클릭");
			}
		});
		p.add(btn2);
		
		add(p);
		setBounds(1920+200,200,500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex08 me =new Ex08();
	}

}






