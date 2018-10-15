package com.bit.day23.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Ex03 extends Frame implements MouseListener, MouseMotionListener{
	Button btn;
	int x,y,gapX,gapY;

	public Ex03() {
		Panel p=new Panel(null);
		
		btn=new Button("클릭");
		btn.addMouseListener(this);
		btn.addMouseMotionListener(this);
		btn.setSize(30, 30);
		btn.setLocation(0, 0);
		btn.setVisible(true);
		p.add(btn);
		
		add(p);
		setBounds(1920+200,200,500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex03 me =new Ex03();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		x+=e.getX()-gapX;
		y+=e.getY()-gapY;
		btn.setLocation(x, y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("클릭");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x=btn.getX();
		y=btn.getY();
		gapX=e.getX();
		gapY=e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
