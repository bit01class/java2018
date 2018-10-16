package com.bit.day24;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02 extends JFrame {
	
	public Ex02() {
		JPanel p = new JPanel(new GridLayout(2,1));
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img=kit.getImage("./game1.png");
		Icon icon=new ImageIcon(img);
		JButton btn=new JButton(icon);
		p.add(btn);
		
		add(p);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		setBounds(1920+200,200,800,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex02 me = new Ex02();
	}

}
