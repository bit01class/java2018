package com.bit.day23.ui;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex05 extends Frame implements ItemListener{
	
	public Ex05() {
		Panel p = new Panel();
		Checkbox chck1=new Checkbox("item1",true);
		Checkbox chck2=new Checkbox("item2",false);
		Checkbox chck3=new Checkbox("item3",false);
		Checkbox chck4=new Checkbox("item4",false);
//		CheckboxGroup cbg=new CheckboxGroup();
//		Checkbox chck1=new Checkbox("item1",cbg,true);
//		Checkbox chck2=new Checkbox("item2",cbg,false);
//		Checkbox chck3=new Checkbox("item3",cbg,false);
//		Checkbox chck4=new Checkbox("item4",cbg,false);
		
		chck1.addItemListener(this);
		chck2.addItemListener(this);
		chck3.addItemListener(this);
		chck4.addItemListener(this);
		
		p.add(chck1);
		p.add(chck2);
		p.add(chck3);
		p.add(chck4);
		
		add(p);
		setBounds(1920+200,200,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex05 me = new Ex05();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox chck = (Checkbox)e.getSource();
		System.out.print(chck.getLabel());
		System.out.print("ÄÄÆ÷³ÍÆ®°¡ ");
		if(chck.getState()){
			System.out.println("¼±ÅÃ(Ã¼Å©)µÊ");
		}else{
			System.out.println("ÇØÁ¦ µÊ");
		}
	}

}

















