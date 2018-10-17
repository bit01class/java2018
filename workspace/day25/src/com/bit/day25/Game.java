package com.bit.day25;

import java.awt.BorderLayout;
import java.awt.Button;
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

public class Game extends Frame implements ActionListener,Runnable{
	int sum=0;
	JButton[] btns;
	Button start, end;
	Label laTop, laDown;
	Panel center;
	
	public Game() {
		Panel p=new Panel(new BorderLayout());
		Panel top=new Panel();
		center=new Panel(new GridLayout(4,4));
		Panel down=new Panel();
		Panel right=new Panel(new GridLayout(5,1));
		
		laTop=new Label("사과를 선택하세요");
		top.add(laTop);
		laDown=new Label("0점");
		down.add(laDown);
		start=new Button("시작");
		end=new Button("종료");
		
		start.addActionListener(this);
		end.addActionListener(this);
		
		right.add(new Label());
		right.add(start);
		right.add(new Label());
		right.add(end);
		right.add(new Label());
		
		btnSet();
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(false);
			center.add(btns[i]);			
		} 
		
		p.add(top,BorderLayout.NORTH);
		p.add(center,BorderLayout.CENTER);
		p.add(down, BorderLayout.SOUTH);
		p.add(right,BorderLayout.EAST);
		add(p);
		setBounds(1920+100,100,900,800);
		setVisible(true);
	}
	
	public void btnSet(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		btns=new JButton[16];
		for(int i=0; i<btns.length; i++){
			String imgName=null;
			if(i%4==0){
				imgName="good1.jpg";
			}else if(i%4==1){
				imgName="good2.jpg";
			}else if(i%4==2){
				imgName="good3.jpg";
			}else {
				imgName="good4.jpg";
			}
			
			Image img=kit.getImage(imgName);
			Icon icon=new ImageIcon(img);
			btns[i]=new JButton(icon);
			if(i%4==0){
				btns[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						sum++;
						laDown.setText(sum+"점");
					}
				});
			}else{
				btns[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						sum-=2;
						laDown.setText(sum+"점");
					}
				});
			}
		}
	}

	public static void main(String[] args) {
		Game game=new Game();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==end){
			dispose();
		}else{
			start.setEnabled(false);
			for(int i=0; i<btns.length; i++){
				btns[i].setEnabled(true);
			}
			Thread thr=new Thread(this);
			thr.start();
			
		}
	}
	
	public void imgChange(){
		for(int i=0; i<1000; i++){
			JButton temp=btns[0];
			int ran=(int)(Math.random()*16);
			btns[0]=btns[ran];
			btns[ran]=temp;
		}
		for(int i=0; i<btns.length; i++){
			center.add(btns[i]);
		}
		center.revalidate();
	}
	
	public int cntDown(int cnt){
		int time=cnt-1;
		laTop.setText(time+"초");
		for(int i=0; i<1; i++){
			imgChange();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		if(time==0) return 0;
		
		return cntDown(time);
	}

	@Override
	public void run() {
		cntDown(5);
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(false);
		}
		start.setEnabled(true);
	}

}






















