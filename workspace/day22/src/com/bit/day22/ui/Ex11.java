package com.bit.day22.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex11 extends Frame implements MouseListener{
	
	public Ex11() {
		Panel p = new Panel();
		
		Button btn = new Button("확인");
		//btn.addMouseListener(this);
		p.add(btn);
		
		addMouseListener(this);
		
		//add(p);
		setBounds(1920+200,200,400,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex11();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// 클릭
		System.out.println("클릭...");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스 누를때
		System.out.println("press");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 누른것이 올라올때
		System.out.println("release");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 마우스 오버
		//System.out.println("enter");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스 아웃
		//System.out.println("exit");
	}

}
