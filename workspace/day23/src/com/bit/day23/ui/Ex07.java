package com.bit.day23.ui;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex07 extends Frame implements ActionListener{
	
	private Button btn1;
	private TextField tf;
	private List list;

	public Ex07() {
		Panel p = new Panel();
		
		btn1=new Button("��ư1");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Ŭ��");
			}
		});
		p.add(btn1);
		
		final TextField tf=new TextField(15);
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(tf.getText()+"�� ����");
			}
		});
		p.add(tf);
		
		list=new List();
		list.addItem("item1");
		list.addItem("item2");
		list.addItem("item3");
		list.addItem("item4");
		list.addActionListener(this);
		p.add(list);
		
		add(p);
		setBounds(1920+200,200,500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex07 me =new Ex07();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){
			System.out.println("��ư Ŭ��");
		}else if(e.getSource()==tf){
			System.out.println("�ؽ�Ʈ�ʵ��� �� \""+tf.getText()+"\"�� ����");
		}else if(e.getSource()==list){
			System.out.println("list���� "+list.getSelectedItem()+"�� ����");
		}
	}

}
















