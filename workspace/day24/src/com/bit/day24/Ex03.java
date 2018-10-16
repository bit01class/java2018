package com.bit.day24;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex03 extends Frame implements ActionListener{
	JButton you,com;
	Label center3;
	
	public Ex03() {
		BorderLayout bl = new BorderLayout();
		Panel main =new Panel(bl);
		Font font=new Font("",Font.BOLD,26);
		Label top=new Label("0 승 0 무 0패");
		top.setAlignment(Label.CENTER);
		top.setFont(font);
		Panel center=new Panel(new BorderLayout());
		Panel center1=new Panel(new GridLayout(1,2));
		Panel center2=new Panel(new GridLayout(1,2));
		center3=new Label("가위바위보를 선택하세요!!!");
		center3.setFont(font);
		center3.setAlignment(Label.CENTER);
		
		Label la1 = new Label("YOU");
		Label la2 = new Label("COM");
		
		la1.setAlignment(Label.CENTER);
		la2.setAlignment(Label.CENTER);
		la1.setFont(font);
		la2.setFont(font);
		la1.setBackground(Color.GRAY);
		la2.setBackground(Color.GRAY);
		
		center1.add(la1);
		center1.add(la2);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("./game1.png"); 
		Icon icon=new ImageIcon(img);
		you=new JButton(icon);
		com=new JButton(icon);
//		you.setEnabled(false);
//		com.setEnabled(false);
		center2.add(you);
		center2.add(com);
		
		center.add(center1,BorderLayout.NORTH);
		center.add(center2,BorderLayout.CENTER);
		center.add(center3,BorderLayout.SOUTH);
		
		Panel down=new Panel(new GridLayout(1,4));
		Button game1=new Button("가위");
		Button game2=new Button("바위");
		Button game3=new Button("보");
		Button exit=new Button("종료");
		game1.setFont(font);
		game2.setFont(font);
		game3.setFont(font);
		exit.setFont(font);
		
		game1.addActionListener(this);
		game2.addActionListener(this);
		game3.addActionListener(this);
		exit.addActionListener(this);
		
		down.add(game1);
		down.add(game2);
		down.add(game3);
		down.add(exit);
		
		main.add(top,BorderLayout.NORTH);
		main.add(center,BorderLayout.CENTER);
		main.add(down,BorderLayout.SOUTH);
		add(main);
		setBounds(1920+200,200,600,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex03 me =new Ex03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();
		if(btn.getLabel().equals("종료")){
			dispose();
			return;
		}
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img=null;
		Image img2=null;
		
		Random ran=new Random();
		int su=ran.nextInt(3);
		
		
		if(btn.getLabel().equals("가위")){
			img = kit.getImage("./game1.png");
			if(su==0){
				center3.setText("비김");
				center3.setBackground(Color.YELLOW);
			}else if(su==1){
				center3.setText("졌음");
				center3.setBackground(Color.RED);
			}else if(su==2){
				center3.setText("이겼음");
				center3.setBackground(Color.BLUE);
			}
		}else if(btn.getLabel().equals("바위")){
			img = kit.getImage("./game2.png"); 
			if(su==0){
				center3.setText("이겼음");
				center3.setBackground(Color.BLUE);
			}else if(su==1){
				center3.setText("비김");
				center3.setBackground(Color.YELLOW);
			}else if(su==2){
				center3.setText("졌음");
				center3.setBackground(Color.RED);
			}
		}else if(btn.getLabel().equals("보")){
			img = kit.getImage("./game3.png"); 
			if(su==0){
				center3.setText("졌음");
				center3.setBackground(Color.RED);
			}else if(su==1){
				center3.setText("이겼음");
				center3.setBackground(Color.BLUE);
			}else if(su==2){
				center3.setText("비김");
				center3.setBackground(Color.YELLOW);
			}
		}
		
		if(su==0){
			img2 = kit.getImage("./game1.png"); 
		}else if(su==1){
			img2 = kit.getImage("./game2.png"); 
		}else if(su==2){
			img2 = kit.getImage("./game3.png"); 
		}
		Icon icon=new ImageIcon(img);
		you.setIcon(icon);
		Icon icon2=new ImageIcon(img2);
		com.setIcon(icon2);
	}

}




















