package com.bit.day23.ui;

import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Ex01 extends Frame implements MouseListener{
	Button btn1,btn4;
	Panel p;
	class Lec01 implements MouseListener{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("버튼2 클릭");
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public Ex01() {
		FlowLayout fl = new FlowLayout();
		p=new Panel(fl);
		p.setName("패널");
		btn1=new Button("버튼");
		btn1.setName("버튼하나");
		btn1.addMouseListener(this);
		p.add(btn1);
		
		Button btn2=new Button("버튼2");
		Lec01 you =new Lec01();
		btn2.addMouseListener(you);
		p.add(btn2);
		
		Button btn3=new Button("버튼3");
		btn3.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("버튼3 클릭");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		p.add(btn3);
		
		btn4=new Button("버튼4");
		btn4.addMouseListener(this);
		p.add(btn4);
		
		p.addMouseListener(this);
		
		add(p);
		setBounds(1920+200,200,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex01 me =new Ex01();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		Component obj = (Component)e.getSource();
//		System.out.println(obj.getName());
		if(e.getSource()==btn1){
			System.out.println("버튼1 클릭");
		}else if(e.getSource()==btn4){
			System.out.println("버튼4 클릭");
		}else if(e.getSource()==p){
			System.out.println("바탕 클릭");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}




















