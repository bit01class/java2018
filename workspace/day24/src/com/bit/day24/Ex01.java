package com.bit.day24;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Ex01 extends Frame{

	public Ex01() {
		Canvas can=new Canvas(){
			@Override
			public void paint(Graphics g) {
				g.setColor(Color.RED);
				g.drawLine(100, 100, 300, 300);
				g.setColor(Color.BLUE);
				g.drawRect(300, 300, 100, 100);
				g.drawOval(300, 100, 100, 100);
				g.setColor(Color.GREEN);
				g.fillRect(500, 300, 100, 100);
				g.fillOval(500, 100, 100, 100);
				g.drawArc(100, 300, 100, 100, 0, 180);
				g.fillArc(100, 100, 100, 100, 0, 270);
				g.setColor(Color.YELLOW);
				g.fill3DRect(200, 200, 100, 100, true);
				
				Toolkit tool = Toolkit.getDefaultToolkit();
				Image img=tool.getImage("./game1.png");
				g.drawImage(img,100,100,this);
				
			}
		};
		
		
		add(can);
		setBounds(1920+200,200,800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex01 me = new Ex01();
	}

}
