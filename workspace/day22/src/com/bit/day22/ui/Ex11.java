package com.bit.day22.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex11 extends Frame implements MouseListener{
	
	public Ex11() {
		Panel p = new Panel();
		
		Button btn = new Button("Ȯ��");
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
		// Ŭ��
		System.out.println("Ŭ��...");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// ���콺 ������
		System.out.println("press");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// �������� �ö�ö�
		System.out.println("release");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// ���콺 ����
		//System.out.println("enter");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// ���콺 �ƿ�
		//System.out.println("exit");
	}

}
