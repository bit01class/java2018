package com.bit.day22.ui;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex14 extends Frame implements KeyListener{
	Button btn;
	int pw,ph;
	
	public Ex14() {
		Panel p=new Panel(null);
		
		btn=new Button("бс");
		btn.setSize(20,20);
		btn.setLocation(0,0);
		btn.setVisible(true);
		btn.addKeyListener(this);
		p.add(btn);
		
		add(p);
		setBounds(1920+200,200,500,500);
		setVisible(true);
		Dimension dim = p.getSize();
		pw=(int)dim.getWidth();
		ph=(int)dim.getHeight();
	}

	public static void main(String[] args) {
		new Ex14();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//      38
		// 37        39
		//      40
		int gap=50;
		int su=e.getKeyCode();
		int x=btn.getX();
		int y=btn.getY();
		if(su==39){
			if(x+gap+20<=pw){
				btn.setLocation(x+gap, y);
			}
		}else if(su==40){
			if(y+gap+20<=ph){
				btn.setLocation(x, y+gap);
			}
		}else if(su==37){
			if(x-gap>=0){
				btn.setLocation(x-gap,y);
			}
		}else if(su==38){
			if(y-gap>=0){
				btn.setLocation(x,y-gap);
			}
		}
	}

}




















