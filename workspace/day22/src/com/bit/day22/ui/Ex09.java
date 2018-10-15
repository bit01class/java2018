package com.bit.day22.ui;

import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;

public class Ex09 extends Frame{
	
	public Ex09() {
		java.awt.MenuBar bar = new MenuBar();
		Menu mn1=new Menu("File");
		Menu mn2=new Menu("Edit");
		Menu mn3=new Menu("Help");
		bar.add(mn1);
		bar.add(mn2);
		bar.add(mn3);
		
		MenuItem mn1_1 = new MenuItem("New");
		MenuItem mn1_2 = new MenuItem("Save");
		MenuItem mn1_3 = new MenuItem("Exit");
		
		mn1.add(mn1_1);
		mn1.add(mn1_2);
		mn1.addSeparator();
		mn1.add(mn1_3);
		
		MenuItem mn2_1=new MenuItem("Undo");
		MenuItem mn2_2=new MenuItem("Redo");
		mn2.add(mn2_1);
		mn2.add(mn2_2);
		mn2.addSeparator();
		CheckboxMenuItem mn2_3=new CheckboxMenuItem("item1");
		CheckboxMenuItem mn2_4=new CheckboxMenuItem("item2",true);
		CheckboxMenuItem mn2_5=new CheckboxMenuItem("item3");
		mn2.add(mn2_3);
		mn2.add(mn2_4);
		mn2.add(mn2_5);
		
		
		this.setMenuBar(bar);
		Panel p=new Panel(null);
		p.setBackground(Color.GREEN);
		
		Button btn = new Button("btn");
		btn.setSize(50,50);
		btn.setLocation(0, 0);
		
		p.add(btn);
		add(p);
		setBounds(1920+200,200,400,500);
		setVisible(true);
		
//		Dialog dia=new Dialog(this,"ÆË¾÷Ã¢");
		Frame dia = new Frame();
		
		MenuBar bar2=new MenuBar();
		Menu mn4=new Menu("Menu");
		bar2.add(mn4);
		dia.setMenuBar(bar2);
		
		dia.setBounds(1920+300, 300, 200, 200);
		dia.setVisible(true);
		
		
	}

	
	public static void main(String[] args) {
		new Ex09();
	}

}
