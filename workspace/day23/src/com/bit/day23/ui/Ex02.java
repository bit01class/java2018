package com.bit.day23.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex02 extends Frame implements MouseListener {
	Button btn;
	
	public Ex02() {
		Panel p=new Panel();
		p.setLayout(null);
		
		btn =new Button("*");
		btn.setBounds(0,0,30,30);
		btn.setVisible(true);
		p.add(btn);
		
		p.addMouseListener(this);
		add(p);
		setBounds(1920+200,200,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex02 me =new Ex02();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("x:"+e.getX()+",y:"+e.getY());
		btn.setLocation(e.getX(), e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("x:"+e.getX()+",y:"+e.getY());
		btn.setLocation(e.getX(), e.getY());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
