package com.bit.day18;

import java.util.Scanner;

/*
 * ---------------------------------------------
 * 학생성적프로그램(0.3.0)
 * ---------------------------------------------
 * 국어 영어 수학
 * 2.입력
 * data="90,80,70\n"
 * 2.입력
 * data="90,80,70\n50,60,70\n"
 * 
 * 1.전체보기
 * -------------------------
 * 학번	|국어	|영어	|수학
 * -------------------------
 * 1	|90		|80		|70
 * 2	|50		|60		|70
 * -------------------------
 * 
 * 1. 전체보기 2.입력 3.상세보기 0.종료>1
 * 
 * --------------------------------------
 * 국어 |영어 |수학 |합계 | 평균
 * --------------------------------------
 * 
 * 1. 전체보기 2.입력 3.상세보기 (4.수정 5.삭제) 0.종료>2
 * 국어>90
 * 영어>80
 * 수학>70
 * 
*/
public class Ex09 {
	static String data="";
	static String title="---------------------------------------------\n학생성적프로그램(0.3.0)\n---------------------------------------------";
	static String menu="1. 전체보기 2.입력 3.상세보기 (4.수정 5.삭제) 0.종료>";
	static String table="--------------------------------------\n국어 |영어 |수학 |합계 | 평균\n--------------------------------------";
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
				
				System.out.print("국어>");
				int kor=sc.nextInt();
				System.out.print("영어>");
				int eng=sc.nextInt();
				System.out.print("수학>");
				int math=sc.nextInt();
				
				data+=kor+","+eng+","+math+"\n";
			} // if end
		}// while end
	}// main end

}

















