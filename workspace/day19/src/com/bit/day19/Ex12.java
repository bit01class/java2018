package com.bit.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * day17 - ex01.java
 * 
 * DB ���ϸ�:data.bin
 * ---------------------------------------------------------
 * BBS - �Խ���(ver 0.1.0)
 * ---------------------------------------------------------
 * 1.��� 2.�۾��� 3.���� (4.���� 5.����) 0.����> 1
 * -----------------------------------------
 * �۹�ȣ	| ����(10�̳�)
 * -----------------------------------------
 * 1		| java
 * -----------------------------------------
 * 
 * 1.��� 2.�۾��� 3.���� (4.���� 5.����) 0.����> 2
 * ����>java2
 * ����>abcdefg......
 * 
 * 1.��� 2.�۾��� 3.���� (4.���� 5.����) 0.����> 1
 * -----------------------------------------
 * �۹�ȣ	| ����(10�̳�)
 * -----------------------------------------
 * 1		| java
 * 2		| java2
 * -----------------------------------------
 * 
 * 
*/

public class Ex12 {
	String bar="---------------------------------------------------------";
	String title="BBS - �Խ���(ver 0.1.0)";
	String header="�۹�ȣ	| ����(10�̳�)";
	String menu="1.��� 2.�۾��� 3.���� (4.���� 5.����) 0.����>";
	String msg="test1\ttesttesttest\ntest2\ttesttesttest\ntest3\ttesttesttest\n";
	ArrayList<String[]> rows = new ArrayList<>();

	public static void main(String[] args) {
		try {
			new Ex12().programStart();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void programStart() throws IOException{
		byte[] buff=new byte[2];
		File file=new File("data.bin");
		file.createNewFile();
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(msg.getBytes());
		FileInputStream fis = new FileInputStream(file);
		
		int su=0;
		String temp="";
		while(true){
			su=fis.read(buff, 0, buff.length);
			if(su==-1){break;}
			temp+=new String(buff,0,su);
		}
		fos.close();
		fis.close();
		
		String[] arrs = temp.split("\n");
		for(int i=0; i<arrs.length; i++){
			String[] arr = arrs[i].split("\t");
			rows.add(arr);
		}
		
		System.out.println(bar);
		System.out.println(title);
		System.out.println(bar);
		Scanner sc = new Scanner(System.in);
		String input=null;
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("1")){
				System.out.println(bar);
				System.out.println(header);
				System.out.println(bar);
				for(int i=0; i<rows.size(); i++){
					String[] row = rows.get(i);
					System.out.println(i+1+"\t| "+row[0]);
					System.out.println(bar);
				}
			}
		}
	}

}






















