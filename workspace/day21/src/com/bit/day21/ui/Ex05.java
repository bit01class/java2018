package com.bit.day21.ui;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex05 extends Frame{
	
	public Ex05() {
		Panel pn =new Panel();

		Label la1=new Label("id:");
		java.awt.TextField tf1=new TextField("abcd",15);
		
		pn.add(la1);
		pn.add(tf1);
		
		Label la2 =new Label();
		la2.setText("pw:");
		TextField tf2=new TextField();
		tf2.setColumns(15);
		tf2.setEchoChar('*');
		pn.add(la2);
		pn.add(tf2);
		
		TextArea ta =new TextArea("",3,10,TextArea.SCROLLBARS_NONE);
		ta.setColumns(10);
		ta.setRows(3);
		pn.add(ta);
		
		add(pn);
		setSize(500,300);
		setLocation(1920+500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex05();

	}

}
