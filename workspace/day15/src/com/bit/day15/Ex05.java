package com.bit.day15;

import java.util.Scanner;

/*
 * --------------------------------------
 * �л� �����������α׷�(ver 0.2.1)
 * --------------------------------------
 * 
 * 1. ��ü���� 2.�Է� 3.�󼼺��� 4.���� 5. ���� 0.����>5
 * ������ �й�>1
 * 
 * --------------------------------------
 * �й� | ���� |���� |���� |�հ� | ���
 * --------------------------------------
 * 1      90     80    70    000   00.00
 * --------------------------------------
 */
public class Ex05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String bar="---------------------------------------------------";
		String title=bar+"\n�л� �����������α׷�(ver 0.2.1)\n"+bar;
		String header=bar+"\n�й�\t|����\t|����\t|����\t|�հ�\t|���\n"+bar;
		String menu="1.��ü���� 2.�Է� 3.�󼼺��� 4.���� 5.���� 0.����>";
		int su=0;
		
//		int[] stu=new int[3];
		int[][] students=new int[0][];
		
		System.out.println(title);
		while(true){
			System.out.print(menu);
			String input=sc.nextLine();
			su=Integer.parseInt(input);
			if(su==0){
				System.out.println("�̿����ּż� �����մϴ�");
				break;
			}else if(su==1){
				System.out.println(header);
				for(int i=0; i<students.length; i++){
					int[] student=students[i];
					System.out.print(i+1+"\t|");
					System.out.print(student[0]+"\t|");
					System.out.print(student[1]+"\t|");
					System.out.print(student[2]+"\t|");
					System.out.print(sum(student)+"\t|");
					System.out.println(avg(student));
				}
				System.out.println(bar);
			}else if(su==2){
				//���� �迭
				int[][] old=students;
				//�ű� �迭
				students=new int[students.length+1][3];
				
				//������ ����
				for(int i=0; i<old.length; i++){
					students[i]=old[i];
				}
				
				//�ű԰� �߰�
				int[] student=students[students.length-1];
				System.out.print("����>");
				input=sc.nextLine();
				student[0]=Integer.parseInt(input);
				System.out.print("����>");
				input=sc.nextLine();
				student[1]=Integer.parseInt(input);
				System.out.print("����>");
				input=sc.nextLine();
				student[2]=Integer.parseInt(input);
				
			}else if(su==3){
				System.out.print("�й�>");
				input=sc.nextLine();
				int[] student=students[Integer.parseInt(input)-1];
				System.out.println(header);
				System.out.print(input+"\t|");
				for(int i=0; i<student.length;i++){
					System.out.print(student[i]+"\t|");
				}
				System.out.print(sum(student)+"\t|");
				System.out.println(avg(student));
				System.out.println(bar);
			}else if(su==4){
				System.out.print("�й�>");
				input=sc.nextLine();
				int[] student=students[Integer.parseInt(input)-1];
				String[] output={"����","����","����"};
				for(int i=0; i<student.length; i++){
					System.out.print(output[i]+">");
					input=sc.nextLine();
					student[i]=Integer.parseInt(input);
				}
			}else if(su==5){
				int[][] temp=new int[students.length-1][];
				System.out.print("�й�>");
				input=sc.nextLine();
				int index=Integer.parseInt(input)-1;
				
				for(int i=0; i<index; i++){
					temp[i]=students[i];
				}
				
				for(int i=index+1; i<students.length; i++){
					temp[i-1]=students[i];
				}
				students=temp;
			}else{
				System.out.println("�Է¿���");
			}
		}//while end
	}// main end
	
	public static int sum(int[] arr){
		int tot=0;
		for(int i=0; i<arr.length; i++){
			tot+=arr[i];
		}
		return tot;
	}
	
	public static double avg(int[] arr){
		return sum(arr)*100/arr.length/100.0;
	}

} // class end
























