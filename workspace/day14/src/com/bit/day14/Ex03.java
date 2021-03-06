package com.bit.day14;

public class Ex03 {
	final static String title = "----------------------------------------------------"
			+ "\n 학생성적관리프로그램(ver 0.1.0)"
			+ "\n ----------------------------------------------------";
	final static String menu = "1.전체보기	2.입력	3.상세보기	0.종료>";

	public static void main(String[] args) {

		System.out.println(title);

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int tot = 0;
		boolean first=false;
		while(tot<=0){
			if(first){
				System.out.println("인원은 0보다 큽니다");
			}
			first=true;
			System.out.print("총인원>");
			try{
				tot=sc.nextInt();// 문자입력,0<=
			}catch(java.util.InputMismatchException e){
				sc=new java.util.Scanner(System.in);
				System.out.println("숫자만 입력하세요");
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
				System.out.println("숫자만 입력하세요");
				continue;
			}
			if (input == 0) {
				System.out.println("이용해주셔서 감사합니다");
				break;
			} else if (input == 1) {
				// 1.전체보기
				String header1 = "----------------------------------------------"
						+ "\n 학번\t| 국어\t| 영어\t| 수학"
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
				// 2.입력
				inputCount++;
				if (tot > inputCount - 1) {
					
					do{
						System.out.print(inputCount + "번 학생 국어>");
						try{
							students[inputCount - 1][0] = sc.nextInt();// 문자,<0,>100
						}catch(java.util.InputMismatchException e){
							sc=new java.util.Scanner(System.in);
							System.out.println("0~100사이의 숫자를 입력하세요");
							students[inputCount - 1][0]=-1;
						}
					}while(students[inputCount - 1][0]<0 || students[inputCount - 1][0]>100);
					System.out.print(inputCount + "번 학생 영어>");
					students[inputCount - 1][1] = sc.nextInt();
					System.out.print(inputCount + "번 학생 수학>");
					students[inputCount - 1][2] = sc.nextInt();
				} else {
					System.out.println("입력하실 학생이 없습니다");
				}

			} else if (input == 3) {
				// 3.상세보기
				int sum = 0;
				String header2 = " ---------------------------------------------------------------"
						+ "\n 학번\t| 국어\t| 영어\t| 수학\t| 합계\t| 평균"
						+ "\n ---------------------------------------------------------------";
				int num=0;
				do{
					try{
						System.out.print("학번>");
						num = sc.nextInt();	// 문자,<=0,tot까지만
					}catch(java.util.InputMismatchException e){
						sc=new java.util.Scanner(System.in);
						System.out.println("정확한 학번을 입력하세요");
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
				System.out.println("ERR)입력오류");
			}

		}
	}
	

}














