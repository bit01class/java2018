package com.bit.day25.cs04;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Frame implements ActionListener {
	TextField tf;
	PrintStream ps;
	
	public Client() {
		Panel p=new Panel(new BorderLayout());
		
		TextArea ta= new TextArea();
		tf=new TextField();
		tf.addActionListener(this);
		
		p.add(ta,BorderLayout.CENTER);
		p.add(tf,BorderLayout.SOUTH);
		add(p);
		setBounds(1920+100,100,400,300);
		setVisible(true);
		
		Socket sock=null;
		InputStream in;
		OutputStream out;
		
		BufferedReader br=null;
		
		try {
			sock=new Socket("10.10.10.10",8080);
			out=sock.getOutputStream();
			in=sock.getInputStream();
			
			ps=new PrintStream(out);
			br=new BufferedReader(new InputStreamReader(in));
			
			while(true){
				String msg=br.readLine();
				ta.append(msg);
				ta.append("\r\n");
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Client me = new Client();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=tf.getText();
		ps.println(msg);
		tf.setText("");
	}

}






















