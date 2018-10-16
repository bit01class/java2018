package com.bit.day24.net;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex04 extends Frame implements ActionListener, FocusListener{
	TextField tf,sub;
	TextArea ta;
	Button btn1;
	public Ex04() {
		Panel p =new Panel(new BorderLayout());
		tf=new TextField("주소를 여기에 입력하세요");
		tf.addFocusListener(this);
		ta=new TextArea();
		ta.setEditable(false);
//		ta.setEnabled(false);
		Panel menu=new Panel();
		sub=new TextField(15);
		btn1=new Button("저장");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=sub.getText();
				if(name.trim().isEmpty()){
					return;
				}
				String msg=ta.getText();
				File file =new File(name);
				Writer fw=null;
				try {
					file.createNewFile();
					fw=new FileWriter(file);
					fw.write(msg);
					fw.flush();
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally{
					try {
						fw.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		Button btn2=new Button("가져오기");
		btn2.addActionListener(this);
		Button btn3=new Button("종료");
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		menu.add(sub);
		menu.add(btn1);
		menu.add(btn2);
		menu.add(btn3);
		
		p.add(tf,BorderLayout.NORTH);
		p.add(ta,BorderLayout.CENTER);
		p.add(menu,BorderLayout.SOUTH);
		add(p);
		setBounds(1920+200,200,600,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex04 me =new Ex04();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=tf.getText();
		
		URL url=null;
		URLConnection conn = null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			url=new URL(msg);
			conn = url.openConnection();
			is=conn.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			String temp=null;
			while((temp=br.readLine())!=null){
				ta.append(temp+"\r\n");
//				System.out.println(temp);
			}
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally{
			try {
				is.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		btn1.setEnabled(true);
	}

	@Override
	public void focusGained(FocusEvent e) {
		// 선택
		System.out.println("focusGained");
		tf.selectAll();
	}

	@Override
	public void focusLost(FocusEvent e) {
		// 포커스 아웃
		System.out.println("focusLost");
	}

}
