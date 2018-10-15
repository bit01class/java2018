package com.bit.day21.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex09 extends Frame{
	
	public Ex09() {
		GridLayout gl=new GridLayout(4,3);
		Panel p=new Panel(gl); 
		
		char[] ch={
				'7','8','9',
				'4','5','6',
				'1','2','3',
				'0','.','=',
				};
		for(int i=0; i<12; i++){
			Button btn=new Button(ch[i]+"");
			p.add(btn);
		}
		
		add(p);
		setSize(500,400);
		setLocation(1920+200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex09();
	}

}
