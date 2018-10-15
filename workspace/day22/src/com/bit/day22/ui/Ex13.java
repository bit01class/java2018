package com.bit.day22.ui;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex13 extends Frame implements KeyListener{

	public Ex13() {
		Panel p =new Panel();
		
		TextField tf=new TextField();
//		tf.addKeyListener(this);
//		p.add(tf);
		
		p.addKeyListener(this);
		
		add(p);
		setBounds(1920+200,200,400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex13();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// ����(keyPressed)
//		System.out.println("keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Ű������
//		System.out.println("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// �����ٶ���
//		System.out.println("keyReleased");
		// Ű�����
		System.out.println(e.getKeyCode());
		System.out.println(e.getKeyChar());
//		int su=e.getKeyCode();
//		System.out.println(e.getKeyText(su));
	}

}




























