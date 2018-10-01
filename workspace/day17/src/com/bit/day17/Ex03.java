package com.bit.day17;

import java.util.ArrayList;
// �Խ���
import java.util.Scanner;

class Bbs{
	String subject;
	String content;
	
	public Bbs() {
		subject="�������";
	}
	
	void showSub(){
		System.out.println("���� | "+subject);
	}
	void showContent(){
		System.out.println("���� | "+content);
	}
	void show(){
		System.out.println(subject+"\t| "+content);
	}
}

public class Ex03 {
	ArrayList<Bbs> list=new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	String title;
	String menu;
	String header;
	
	
	public Ex03() {
		title="---------------------------------------";
		title+="\nBBS - �Խ���(ver 0.0.3)\n";
		title+="---------------------------------------";
		menu="1.��� 2.�۾��� 3.���� 4.���� 5.���� 0.����> ";
		header="-----------------------------------------" +
				"\n�۹�ȣ	| ����(10�̳�)\n" +
				"-----------------------------------------";
	}

	public static void main(String[] args) {
		new Ex03().programStart();
	}
	
	public void programStart(){
		System.out.println(title);
		int su=0;
		while((su=inputSu(menu))!=0){
			if(su==1){
				System.out.println(header);
				for(int i=0; i<list.size(); i++){
					Bbs row = list.get(i);
					System.out.println(i+1+"\t| "+row.subject);
				}
			}else if(su==2){
				Bbs ele=new Bbs();
				System.out.print("����> ");
				String temp=sc.nextLine();
				if(!temp.trim().isEmpty()){
					ele.subject=temp;
				}
				System.out.print("����> ");
				ele.content=sc.nextLine();
				
				list.add(ele);
			}else if(su==3){
				int idx=inputSu("�۹�ȣ>")-1;
				if(idx<list.size()){
					Bbs row = list.get(idx);
					System.out.println("---------------------------------");
					row.showSub();
					System.out.println("---------------------------------");
					row.showContent();
					System.out.println("---------------------------------");
				}else{
					System.out.println("�۹�ȣ �ٽ� Ȯ���ϼ���");
				}
			}else if(su==4){
				int idx=inputSu("������ �۹�ȣ>")-1;
				if(idx<0 || idx>=list.size()){
					System.out.println("�۹�ȣ �ٽ� Ȯ���ϼ���");
					continue;
				}
				Bbs row = list.get(idx);
				System.out.print("����> ");
				String temp=sc.nextLine();
				if(!temp.trim().isEmpty()){
					row.subject=temp;
				}
				System.out.print("����> ");
				row.content=sc.nextLine();
			}else if(su==5){
				try{
					list.remove(inputSu("������ �۹�ȣ>")-1);
				}catch(IndexOutOfBoundsException e){
					System.out.println("���� �۹�ȣ�Դϴ� �ٽ�Ȯ���ϼ���");
				}
			}else{
				
			}// if end
		}// while end
	}// program end
	public int inputSu(String msg){
		System.out.print(msg);
		int su=-1;
//		try{
//			su=Integer.parseInt(temp);
//		}catch(NumberFormatException e){
//			su=inputSu(msg);
//		}
		while(su<0){
			try{
				String temp=sc.nextLine();
				su=Integer.parseInt(temp);
			}catch(NumberFormatException e){
				System.out.println("0�̻��� ���ڸ� �Է��ϼ���");
				System.out.print(msg);
			}
		}
		return su;
	}// inputSu end

}























