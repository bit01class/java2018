package com.bit.day21.ui;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
//java.awt
//javax.swing
public class Ex04 extends javax.swing.JFrame {

	public Ex04() {
		Panel pn=new Panel();
		
		Font font=new Font("Arial",Font.PLAIN,20);
		Color color=new Color(255,255,255);//rgb
		
		java.awt.Label la1=new Label("기능1:");
		la1.setBackground(color);
		la1.setFont(font);
		
		java.awt.Button btn1=new Button("버튼1");
		btn1.setBackground(Color.GREEN);
		btn1.setFont(font);
		pn.add(la1);
		pn.add(btn1);
		
		javax.swing.JLabel la2=new javax.swing.JLabel();
		la2.setText("기능2:");
		javax.swing.JButton btn2=new javax.swing.JButton();
		btn2.setLabel("버튼2");
		pn.add(la2);
		pn.add(btn2);
		
		java.awt.Checkbox ch1=new Checkbox("체크박스1",true);
		Checkbox ch2=new Checkbox();
		ch1.setFont(font);
		ch2.setFont(font);
		ch2.setLabel("체크박스2");
		ch2.setState(true);
		pn.add(ch1);
		pn.add(ch2);
		
		CheckboxGroup group=new CheckboxGroup();
		Checkbox ra1=new Checkbox("라디오박스1",group,true);
		Checkbox ra2=new Checkbox("라디오박스2",group,true);
		Checkbox ra3=new Checkbox("라디오박스3",group,false);
		
		pn.add(ra1);
		pn.add(ra2);
		pn.add(ra3);
		
		add(pn);
		setSize(800,200);
		setLocation(1920+200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex04();
	}

}
