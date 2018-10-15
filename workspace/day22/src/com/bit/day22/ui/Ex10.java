package com.bit.day22.ui;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex10 extends Frame implements WindowListener,MouseListener {
	Dialog log;
	public Ex10() {
		log=new Dialog(this,"Ȯ��");
		log.setBounds(1920+300,300,200,200);
		log.setVisible(false);
		
		this.addWindowListener(this);
		this.addMouseListener(this);
		setBounds(1920+200,200,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex10();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// ������
		System.out.println("windowOpened...");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// �ݱ����
		System.out.println("windowClosing...");
		log.setVisible(true);
		//System.exit(0);
		//dispose();// ������
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// ������� ������
		System.out.println("windowClosed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// �ּ�ȭ
		//System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// ���ּ�ȭ
		//System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// Ȱ��ȭ
		//System.out.println("windowActivated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// ��Ȱ��ȭ
		//System.out.println("windowDeactivated");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ŭ��");
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
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
