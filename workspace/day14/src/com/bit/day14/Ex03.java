package com.bit.day14;

public class Ex03 {
	final static String title = "----------------------------------------------------"
			+ "\n �л������������α׷�(ver 0.1.0)"
			+ "\n ----------------------------------------------------";
	final static String menu = "1.��ü����	2.�Է�	3.�󼼺���	0.����>";

	public static void main(String[] args) {

		System.out.println(title);

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int tot = 0;
		boolean first=false;
		while(tot<=0){
			if(first){
				System.out.println("�ο��� 0���� Ů�ϴ�");
			}
			first=true;
			System.out.print("���ο�>");
			try{
				tot=sc.nextInt();// �����Է�,0<=
			}catch(java.util.InputMismatchException e){
				sc=new java.util.Scanner(System.in);
				System.out.println("���ڸ� �Է��ϼ���");
			}
		}
		int input = 0;
		int[][] students = new int[tot][3];
		int inputCount = 0;
		while (true) {
			System.out.println(menu);
			try{
				input = sc.nextInt();
			}catch(java.util.InputMismatchException e){
				sc=new java.util.Scanner(System.in);
				System.out.println("���ڸ� �Է��ϼ���");
				continue;
			}
			if (input == 0) {
				System.out.println("�̿����ּż� �����մϴ�");
				break;
			} else if (input == 1) {
				// 1.��ü����
				String header1 = "----------------------------------------------"
						+ "\n �й�\t| ����\t| ����\t| ����"
						+ "\n ----------------------------------------------";
				System.out.println(header1);
				for (int i = 0; i < students.length; i++) {
					int[] stu = students[i];
					System.out.print(i + 1);
					// System.out.print("\t| "+stu[0]);
					// System.out.print("\t| "+stu[1]);
					// System.out.print("\t| "+stu[2]);
					for (int j = 0; j < stu.length; j++) {
						System.out.print("\t| " + stu[j]);
					}
					System.out.println();
				}

			} else if (input == 2) {
				// 2.�Է�
				inputCount++;
				if (tot > inputCount - 1) {
					
					do{
						System.out.print(inputCount + "�� �л� ����>");
						try{
							students[inputCount - 1][0] = sc.nextInt();// ����,<0,>100
						}catch(java.util.InputMismatchException e){
							sc=new java.util.Scanner(System.in);
							System.out.println("0~100������ ���ڸ� �Է��ϼ���");
							students[inputCount - 1][0]=-1;
						}
					}while(students[inputCount - 1][0]<0 || students[inputCount - 1][0]>100);
					System.out.print(inputCount + "�� �л� ����>");
					students[inputCount - 1][1] = sc.nextInt();
					System.out.print(inputCount + "�� �л� ����>");
					students[inputCount - 1][2] = sc.nextInt();
				} else {
					System.out.println("�Է��Ͻ� �л��� �����ϴ�");
				}

			} else if (input == 3) {
				// 3.�󼼺���
				int sum = 0;
				String header2 = " ---------------------------------------------------------------"
						+ "\n �й�\t| ����\t| ����\t| ����\t| �հ�\t| ���"
						+ "\n ---------------------------------------------------------------";
				int num=0;
				do{
					try{
						System.out.print("�й�>");
						num = sc.nextInt();	// ����,<=0,tot������
					}catch(java.util.InputMismatchException e){
						sc=new java.util.Scanner(System.in);
						System.out.println("��Ȯ�� �й��� �Է��ϼ���");
					}
				}while(num<=0 || num>tot);
				System.out.println(header2);
				System.out.print(num + "\t| ");
				System.out.print(students[num - 1][0] + "\t| ");
				System.out.print(students[num - 1][1] + "\t| ");
				System.out.print(students[num - 1][2] + "\t| ");
				for (int j = 0; j < students[num - 1].length; j++) {
					sum += students[num - 1][j];
				}
				System.out.print(sum + "\t| ");
				System.out.print(sum * 100 / students[num - 1].length / 100.0);
				System.out.println();

			} else {
				System.out.println("ERR)�Է¿���");
			}

		}
	}
	

}













