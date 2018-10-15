package com.bit.day22.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex04 extends Frame {
	
	public Ex04() {
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		Panel p = new Panel(gbl);
		
		
		Button btn1 = new Button("1");
		// x,y 좌표
		gbc.gridx=0;
		gbc.gridy=0;
		// x,y 넓이
		gbc.gridwidth=1;
		gbc.gridheight=1;
		//채우는 가중치
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		p.add(btn1,gbc);
		Button btn2 = new Button("2");
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		p.add(btn2,gbc);
		Button btn3 = new Button("3");
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		p.add(btn3,gbc);
		Button btn4 = new Button("4");
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		//채우는 가중치
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		p.add(btn4,gbc);
		Button btn5 = new Button("5");
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		p.add(btn5,gbc);
		Button btn6 = new Button("6");
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth=2;
		gbc.gridheight=2;
		p.add(btn6,gbc);
		
		add(p);
		setBounds(1920+200,200,500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
