package com.bit.day14;

class MyNumException extends Exception{
	public MyNumException(String msg) {
		super(msg);
	}
}

public class Ex02 {
	final static String title = "----------------------------------------------------"
			+ "\n �л������������α׷�(ver 0.1.0)"
			+ "\n ----------------------------------------------------";
	final static String menu = "1.��ü����	2.�Է�	3.�󼼺���	0.����>";
	
	static int[][] students;
	static int tot;
	static int inputCount;
	static java.util.Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(title);

//		boolean result=true;
//		while(result){
//			System.out.print("���ο�>");
//			try{
//				tot = sc.nextInt();
//				if(tot<=0){
//					throw new MyNumException("0����������");
//				}
//				result=false;
//			}catch(java.util.InputMismatchException e){
//				sc = new java.util.Scanner(System.in);
//				System.out.println(e.getMessage());
//			}catch(MyNumException e){
//				System.out.println(e.getMessage());
//			}
//		}
		try{
			while(true){
				try{
					System.out.print("���ο�>");
					tot = sc.nextInt();
					if(tot>0){
						throw new MyNumException("����");
					}
				}catch(java.util.InputMismatchException e){
					sc = new java.util.Scanner(System.in);
				}
			}
		}catch(MyNumException e){
			
		}
		int input = 0;
		
		students = new int[tot][3];
		
		
		while (true) {
			System.out.println(menu);
			input = sc.nextInt();
			if (input == 0) {
				System.out.println("�̿����ּż� �����մϴ�");
				break;
			} else if (input == 1) {
				// 1.��ü����
				stuList();

			} else if (input == 2) {
				// 2.�Է�
				stuInput();

			} else if (input == 3) {
				// 3.�󼼺���
				stuView();

			} else {
				System.out.println("ERR)�Է¿���");
			}

		}
	}//main end
	
	public static void stuList(){
		String header1 = "----------------------------------------------"
				+ "\n �й�\t| ����\t| ����\t| ����"
				+ "\n ----------------------------------------------";
		System.out.println(header1);
		for (int i = 0; i < students.length; i++) {
			int[] stu = students[i];
			System.out.print(i + 1);
			for (int j = 0; j < stu.length; j++) {
				System.out.print("\t| " + stu[j]);
			}
			System.out.println();
		}
	} // stuList end

	public static void stuInput(){
		inputCount++;
		if (tot > inputCount - 1) {
//			System.out.print(inputCount + "�� �л� ����>");
//			students[inputCount - 1][0] = sc.nextInt();
//			System.out.print(inputCount + "�� �л� ����>");
//			students[inputCount - 1][1] = sc.nextInt();
//			System.out.print(inputCount + "�� �л� ����>");
//			students[inputCount - 1][2] = sc.nextInt();
			
			String[] msgs={"�� �л� ����>","�� �л� ����>","�� �л� ����>"};
			for(int i=0; i<msgs.length; i++){
				try{
				
					System.out.print(inputCount + msgs[i]);
				    students[inputCount - 1][i] = sc.nextInt();
				    if(students[inputCount - 1][i]<0||students[inputCount - 1][i]>100){
				    	throw new MyNumException("���������� �ƴ�");
				    }
				}catch(java.util.InputMismatchException e){
					sc=new java.util.Scanner(System.in);
					i--;
				}catch(MyNumException e){
					System.out.println(e.getMessage());
					i--;
				}
			}
			
		} else {
			System.out.println("�Է��Ͻ� �л��� �����ϴ�");
		}
	}// stuInput end
	
	public static void stuView(){
		int sum = 0;
		String header2 = " ---------------------------------------------------------------"
				+ "\n �й�\t| ����\t| ����\t| ����\t| �հ�\t| ���"
				+ "\n ---------------------------------------------------------------";
		int num =0;
		boolean result=true;
		while(result){
			try{
				System.out.print("�й�>");
				num=sc.nextInt();
				if(num<=0 || num>tot){
					throw new MyNumException("�й��� �ٽ�Ȯ��");
				}
				result=false;
			}catch(java.util.InputMismatchException e){
				sc=new java.util.Scanner(System.in);
			}catch(MyNumException e){
				e.printStackTrace();
			}
		}

		System.out.println(header2);
		System.out.print(num + "\t| ");
		for(int i=0; i<students[num-1].length; i++){
			System.out.print(students[num-1][i]+"\t| ");
			sum += students[num - 1][i];
		}
		System.out.print(sum + "\t| ");
		System.out.print(sum * 100 / students[num - 1].length / 100.0);
		System.out.println();
	}// stuView end
}




















