package com.bit.day14;

public class Ex02 {
	final static String title = "----------------------------------------------------"
			+ "\n 학생성적관리프로그램(ver 0.1.0)"
			+ "\n ----------------------------------------------------";
	final static String menu = "1.전체보기	2.입력	3.상세보기	0.종료>";
	
	static int[][] students;
	static int tot;
	static int inputCount;
	static java.util.Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(title);


		System.out.print("총인원>");
		tot = sc.nextInt();
		int input = 0;
		
		students = new int[tot][3];
		
		while (true) {
			System.out.println(menu);
			input = sc.nextInt();
			if (input == 0) {
				System.out.println("이용해주셔서 감사합니다");
				break;
			} else if (input == 1) {
				// 1.전체보기
				stuList();

			} else if (input == 2) {
				// 2.입력
				stuInput();

			} else if (input == 3) {
				// 3.상세보기
				stuView();

			} else {
				System.out.println("ERR)입력오류");
			}

		}
	}//main end
	
	public static void stuList(){
		String header1 = "----------------------------------------------"
				+ "\n 학번\t| 국어\t| 영어\t| 수학"
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
			System.out.print(inputCount + "번 학생 국어>");
			students[inputCount - 1][0] = sc.nextInt();
			System.out.print(inputCount + "번 학생 영어>");
			students[inputCount - 1][1] = sc.nextInt();
			System.out.print(inputCount + "번 학생 수학>");
			students[inputCount - 1][2] = sc.nextInt();
		} else {
			System.out.println("입력하실 학생이 없습니다");
		}
	}// stuInput end
	
	public static void stuView(){
		int sum = 0;
		String header2 = " ---------------------------------------------------------------"
				+ "\n 학번\t| 국어\t| 영어\t| 수학\t| 합계\t| 평균"
				+ "\n ---------------------------------------------------------------";
		System.out.print("학번>");
		int num = sc.nextInt();

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





















