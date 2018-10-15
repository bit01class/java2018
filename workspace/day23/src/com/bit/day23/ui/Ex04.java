package com.bit.day23.ui;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex04 extends Frame implements TextListener, KeyListener{

	public Ex04() {
		Panel p =new Panel();
		
		TextField tf=new TextField(15);
		tf.addTextListener(this);
		tf.addKeyListener(this);
		p.add(tf);
		
		add(p);
		setBounds(1920+200,200,400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex04 me = new Ex04();
	}

	@Override
	public void textValueChanged(TextEvent e) {
		TextField tf = (TextField) e.getSource();
		System.out.println("textValueChanged:"+tf.getText());
	}

	@Override
	public void keyTyped(KeyEvent e) {

		TextField tf = (TextField) e.getSource();
		System.out.println("typed:"+e.getKeyChar());
		System.out.println("typed:"+tf.getText());
	}

	@Override
	public void keyPressed(KeyEvent e) {

		TextField tf = (TextField) e.getSource();
		System.out.println("Pressed:"+e.getKeyChar());
		System.out.println("Pressed:"+tf.getText());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {

		TextField tf = (TextField) e.getSource();
		System.out.println("Released:"+e.getKeyChar());
		System.out.println("Released:"+tf.getText());
		
	}

}
















