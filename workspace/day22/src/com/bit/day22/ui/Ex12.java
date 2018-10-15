package com.bit.day22.ui;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex12 extends Frame implements MouseMotionListener{
	
	public Ex12() {
		Panel p = new Panel();
		
		p.addMouseMotionListener(this);
		
		add(p);
		setBounds(1920+200,200,500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex12();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("드레그");
		//절대좌표
		//System.out.println("x:"+e.getX()+",y:"+e.getY());
		//스크린 해상도
		System.out.println("x:"+e.getXOnScreen()+",y:"+e.getYOnScreen());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("무브");
	}

}



















