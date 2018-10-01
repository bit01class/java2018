package com.bit.day17;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * (�迭)
 * ---------------------------------------
 * BBS - �Խ���(ver 0.0.1)
 * ------------------------------------------
*/
public class Ex01 {

	public static void main(String[] args) {
		// ~jdk1.6
//		ArrayList<String[]> list = new ArrayList<String[]>();
		// jdk1.7~
		ArrayList<String[]> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String menu="1.��� 2.�۾��� 3.���� (4.���� 5.����) 0.����> ";
		String title="---------------------------------------";
		title+="\nBBS - �Խ���(ver 0.0.1)\n";
		title+="---------------------------------------";
		String input="";
		
		System.out.println(title);
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if("0".equals(input)){
				break;
			}else if("1".equals(input)){
				//������
				String header="-----------------------------------------\n�۹�ȣ	| ����(10�̳�)\n-----------------------------------------";
				System.out.println(header);
				for(int i=0; i<list.size(); i++){
					String[] temp=list.get(i);
					System.out.print(i+1);
					System.out.print("\t| ");
					if(temp[0].length()<=10){
						System.out.println(temp[0]);
					}else{
						String sub=temp[0].substring(0, 10)+"...";
						System.out.println(sub);
					}
				}
				System.out.println("-----------------------------------------\n\n");
			}else if("2".equals(input)){
				//�۾���
				String[] row=new String[2];
				System.out.print("����>");
				row[0]=sc.nextLine();
				if("".equals(row[0])){
					row[0]="�������";
				}
				System.out.print("����>");
				row[1]=sc.nextLine();
				list.add(row);
				
			}else if("3".equals(input)){
				
				System.out.print("�۹�ȣ>");
				input=sc.nextLine();
				
				int idx=-1;
				try{
					idx=Integer.parseInt(input)-1;
				}catch(NumberFormatException e){
				}
				if(idx<list.size() && idx>=0){
					String[] temp=list.get(idx);
					System.out.println("-----------------------------------------");
					System.out.println("���� | "+temp[0]);
					System.out.println("-----------------------------------------");
					System.out.println("���� | "+temp[1]);
					System.out.println("-----------------------------------------\n\n");
				}else{
					System.out.println("�۹�ȣ�� �ٽ� Ȯ���Ͻð� �Է��ϼ���");
				}
			}
		}//while end
		
	}//main end

}//class end

































