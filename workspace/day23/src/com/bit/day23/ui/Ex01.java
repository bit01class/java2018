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
			System.out.println("��ư2 Ŭ��");
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
		p.setName("�г�");
		btn1=new Button("��ư");
		btn1.setName("��ư�ϳ�");
		btn1.addMouseListener(this);
		p.add(btn1);
		
		Button btn2=new Button("��ư2");
		Lec01 you =new Lec01();
		btn2.addMouseListener(you);
		p.add(btn2);
		
		Button btn3=new Button("��ư3");
		btn3.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("��ư3 Ŭ��");
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
		
		btn4=new Button("��ư4");
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
			System.out.println("��ư1 Ŭ��");
		}else if(e.getSource()==btn4){
			System.out.println("��ư4 Ŭ��");
		}else if(e.getSource()==p){
			System.out.println("���� Ŭ��");
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




















