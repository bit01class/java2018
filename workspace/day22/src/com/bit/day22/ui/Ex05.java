package com.bit.day22.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex05 extends Frame{
	Panel p;
	GridBagConstraints gbc;
	
	public Ex05() {
		GridBagLayout gbl=new GridBagLayout();
		gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		p = new Panel(gbl);
		String[] msgs=new String[]{
				"Num","/","*","-",
				"7","8","9","+",
				"4","5","6",
				"1","2","3","ent",
				"0","."
		};
		
		Button[] btn=new Button[msgs.length]; 
		for(int i=0; i<btn.length; i++){
			btn[i]=new Button(msgs[i]);
		}
//		btn[0],0,0,1,1,1.0,1.0
		setGgc(btn[0],0,0,1,1,1.0,1.0);
		setGgc(btn[1],1,0,1,1,1.0,1.0);
		setGgc(btn[2],2,0,1,1,1.0,1.0);
		setGgc(btn[3],3,0,1,1,1.0,1.0);
		
		setGgc(btn[4],0,1,1,1,1.0,1.0);
		setGgc(btn[5],1,1,1,1,1.0,1.0);
		setGgc(btn[6],2,1,1,1,1.0,1.0);
		setGgc(btn[7],3,1,1,2,1.0,1.0);
		
		setGgc(btn[8],0,2,1,1,1.0,1.0);
		setGgc(btn[9],1,2,1,1,1.0,1.0);
		setGgc(btn[10],2,2,1,1,1.0,1.0);
		
		setGgc(btn[11],0,3,1,1,1.0,1.0);
		setGgc(btn[12],1,3,1,1,1.0,1.0);
		setGgc(btn[13],2,3,1,1,1.0,1.0);
		setGgc(btn[14],3,3,1,2,1.0,1.0);
		
		setGgc(btn[15],0,4,1,1,1.0,1.0);
		setGgc(btn[16],1,4,2,1,1.0,1.0);
		
		add(p);
		setBounds(1920+200,200,400,500);
		setVisible(true);
	}
	
	public void setGgc(Button btn,int x,int y,int w,int h,double wx,double wy){
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=w;
		gbc.gridheight=h;
		gbc.weightx=wx;
		gbc.weighty=wy;
		p.add(btn,gbc);		
	}

	public static void main(String[] args) {
		new Ex05();
	}

}
























