package com.bit.day22.ui;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Ex07 extends Frame{
	
	public Ex07() {
		
		
//		setLocation();
//		setLocation(1920+1920/2-400/2,1080/2-400/2);
		//1920*1080
		Dimension dim1=new Dimension(300,200);
		
		setSize(dim1);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int w=(int)dim.getWidth();
		int h=(int)dim.getHeight();
		
		Dimension dim2 = getSize();
		int wsize=dim2.width;
		int hsize=dim2.height;
		
		setLocation(1920+w/2-wsize/2,h/2-hsize/2);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07();
	}

}
