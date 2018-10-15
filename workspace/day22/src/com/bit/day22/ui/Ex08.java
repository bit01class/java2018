package com.bit.day22.ui;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Ex08 extends Frame {
	
	public Ex08() {
		this.setTitle("내 프로그램");
		Dialog dl=new Dialog(this,"종료확인");
		
		Panel dp=new Panel(new GridLayout(2,1));
		Label la= new Label("종료하시겠습니까?");
		la.setAlignment(Label.CENTER);
		dp.add(la);
		Panel ddp=new Panel();
		Button btn1=new Button("Yes");
		ddp.add(btn1);
		Button btn2=new Button("No");
		ddp.add(btn2);
		dp.add(ddp);
		
		dl.add(dp);
		
		setBounds(1920+200,200,500,500);
		setVisible(true);
		Dimension dim = getSize();
		
		dl.setSize(300, 200);
		dl.setLocation(getX()+dim.width/2-300/2, getY()+dim.height/2-200/2);
		dl.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex08();
	}

}
