package com.bit.day18;

import java.util.Scanner;

/*
 * ---------------------------------------------
 * �л��������α׷�(0.3.0)
 * ---------------------------------------------
 * ���� ���� ����
 * 2.�Է�
 * data="90,80,70\n"
 * 2.�Է�
 * data="90,80,70\n50,60,70\n"
 * 
 * 1.��ü����
 * -------------------------
 * �й�	|����	|����	|����
 * -------------------------
 * 1	|90		|80		|70
 * 2	|50		|60		|70
 * -------------------------
 * 
 * 1. ��ü���� 2.�Է� 3.�󼼺��� 0.����>1
 * 
 * --------------------------------------
 * ���� |���� |���� |�հ� | ���
 * --------------------------------------
 * 
 * 1. ��ü���� 2.�Է� 3.�󼼺��� (4.���� 5.����) 0.����>2
 * ����>90
 * ����>80
 * ����>70
 * 
*/
public class Ex09 {
	static String data="";
	static String title="---------------------------------------------\n�л��������α׷�(0.3.0)\n---------------------------------------------";
	static String menu="1. ��ü���� 2.�Է� 3.�󼼺��� (4.���� 5.����) 0.����>";
	static String table="--------------------------------------\n���� |���� |���� |�հ� | ���\n--------------------------------------";
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(title);
		int input=0;
		// file -> data
		while(true){
			System.out.print(menu);
			input=sc.nextInt();
			if(input==0){
				// io file ->
				break;
			}else if(input==1){
				String[] row=data.split("\n");
				String[][] stu=new String[row.length][];
				for(int i=0; i<row.length; i++){
					stu[i]=row[i].split(",");
				}
				
				System.out.println(table);
				for(int i=0; i<stu.length; i++){
					for(int j=0; j<stu[i].length; j++){
						System.out.print(stu[i][j]+"\t|");
					}
					System.out.println();
				}
				
			}else if(input==2){
				
				System.out.print("����>");
				int kor=sc.nextInt();
				System.out.print("����>");
				int eng=sc.nextInt();
				System.out.print("����>");
				int math=sc.nextInt();
				
				data+=kor+","+eng+","+math+"\n";
			} // if end
		}// while end
	}// main end

}

















