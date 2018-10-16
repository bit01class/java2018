package com.bit.day24.net;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex05 extends Frame implements WindowListener,ActionListener {
	TextArea ta;

	public Ex05() {
		MenuBar bar = new MenuBar();
		Menu menu1=new Menu("File");
		Menu menu2=new Menu("Help");
		
		MenuItem menu1_1=new MenuItem("Open");
		menu1_1.addActionListener(this);
		MenuItem menu1_2=new MenuItem("Save");
		menu1_2.addActionListener(this);
		MenuItem menu1_3=new MenuItem("Exit");
		menu1_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		menu1.add(menu1_1);
		menu1.add(menu1_2);
		menu1.addSeparator();
		menu1.add(menu1_3);
		
		MenuItem menu2_1=new MenuItem("About...");
		menu2.add(menu2_1);
		
		bar.add(menu1);
		bar.add(menu2);
		
		
		
		ta=new TextArea();
		
		setMenuBar(bar);
		addWindowListener(this);
		add(ta);
		setBounds(1920+100, 100, 600, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MenuItem item=(MenuItem)e.getSource();
		String title=item.getLabel();
		
		FileDialog dia= new FileDialog(this);
		
		if(title.equals("Open")){
			dia.setMode(FileDialog.LOAD);
		}else if(title.equals("Save")){
			dia.setMode(FileDialog.SAVE);
		}
		dia.setBounds(1920+300, 300, 400, 300);
		dia.setVisible(true);
		
		if(title.equals("Open")){
			open(dia.getDirectory(),dia.getFile());
		}else if(title.equals("Save")){
			save(dia.getDirectory(),dia.getFile());
		}
	}
	
	public void open(String path,String filename){
		//System.out.println(path);
		path=path.replace("\\", "\\\\");
		System.out.println(path);
		File file =new File(path+filename);
		Reader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			StringBuffer sb=new StringBuffer();
			String msg=null;
			while((msg=br.readLine())!=null){
				sb.append(msg);
				sb.append("\r\n");
			}
			ta.setText(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void save(String path,String filename){
		path=path.replace("\\", "\\\\");
		System.out.println(path);
		File file =new File(path+filename);
		Writer fw=null;
		PrintWriter pw=null;
		
		try {
			fw=new FileWriter(file);
			pw=new PrintWriter(fw);
			
			pw.write(ta.getText());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}






































