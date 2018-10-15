package com.bit.day23.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex09 extends MouseAdapter {

	public static void main(String[] args) {
		Frame f=new Frame();
		
		Button btn=new Button("큰버튼");
		btn.addMouseListener(new Ex09());
		f.add(btn);
		
		f.setBounds(1920+200,200,500,400);
		f.setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("MouseAdapter를 이용한 이벤트");
	}

}

















