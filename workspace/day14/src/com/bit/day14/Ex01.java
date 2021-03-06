package com.bit.day14;

/*
 * ----------------------------------------------------
 * 학생성적관리프로그램(ver 0.1.0)
 * ----------------------------------------------------
 * 총인원>3
 * 1.전체보기	2.입력	3.상세보기	0.종료>2
 * 
 * 1번 학생 국어>70
 * 1번 학생 영어>80
 * 1번 학생 수학>90
 * 
 * 1.전체보기	2.입력	3.상세보기	0.종료>1
 * 
 * ---------------------------------------------
 * 학번		| 국어		| 영어		| 수학		
 * ---------------------------------------------
 * 1			70			80			90		
 * 2			0			0			0		
 * 3			0			0			0		
 * ---------------------------------------------
 * 
 * 1.전체보기	2.입력	3.상세보기	(4.수정)	0.종료>2
 * 
 * 2번 학생 국어>90
 * 2번 학생 영어>80
 * 2번 학생 수학>70
 * 
 * 1.전체보기	2.입력	3.상세보기	0.종료>1
 * 
 * ----------------------------------------------
 * 학번		| 국어		| 영어		| 수학		
 * ----------------------------------------------
 * 1			70			80			90		
 * 2			90			80			70		
 * 3			0			0			0		
 * ----------------------------------------------
 * 
 * 1.전체보기	2.입력	3.상세보기	(4.수정)	0.종료>3
 * 
 * 학번> 1
 * 
 * ---------------------------------------------------------------
 * 학번		| 국어		| 영어		| 수학		| 합계		| 평균
 * ---------------------------------------------------------------
 * 1			70			80			90			000			00.00
 * ---------------------------------------------------------------
 * 
 * 
 * 
*/
public class Ex01 {
	final static String title=" ----------------------------------------------------"
							 +"\n 학생성적관리프로그램(ver 0.1.0)"
							 +"\n ----------------------------------------------------";
	final static String menu="1.전체보기\t2.입력\t3.상세보기\t4.수정\t0.종료>";

	public static void main(String[] args) {
		
		System.out.println(title);
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int tot=numInput("총인원>",1,20);
		int input=0;
		int[][] students=new int[tot][3];
		int inputCount=0;
		while(true){
			input=numInput(menu,0,4);
			if(input==0){
				System.out.println("이용해주셔서 감사합니다");
				break;
			}else if(input==1){
				//1.전체보기
				String header1=" ----------------------------------------------"
								 +"\n 학번\t| 국어\t| 영어\t| 수학"		
								 +"\n ----------------------------------------------";
				System.out.println(header1);
				for(int i=0; i<students.length; i++){
					int[] stu=students[i];
					System.out.print(i+1);
					for(int j=0; j<stu.length; j++){
						System.out.print("\t| "+stu[j]);
					}
					System.out.println();
				}
				
			}else if(input==2){
				//2.입력
				inputCount++;
				if(tot>inputCount-1){
//				students[inputCount-1][0]=numInput(inputCount+"번 학생 국어>",0,100);
//				students[inputCount-1][1]=numInput(inputCount+"번 학생 영어>",0,100);
//				students[inputCount-1][2]=numInput(inputCount+"번 학생 수학>",0,100);
				
					String[] lec={"국어","영어","수학"};
					for(int i=0; i<students[inputCount-1].length; i++){
						students[inputCount-1][i]=numInput(inputCount+"번 학생 "+lec[i]+">",0,100);
					}
				
				}else{
					System.out.println("입력하실 학생이 없습니다");
				}
				
			}else if(input==3){
				//3.상세보기
				int sum=0;
				String header2=" ---------------------------------------------------------------"
								 +"\n 학번\t| 국어\t| 영어\t| 수학\t| 합계\t| 평균"
								 +"\n ---------------------------------------------------------------";
				int num=numInput("수정할 학번>",1,tot);
				
				System.out.println(header2);
				System.out.print(num+"\t| ");
				System.out.print(students[num-1][0]+"\t| ");
				System.out.print(students[num-1][1]+"\t| ");
				System.out.print(students[num-1][2]+"\t| ");
				for(int j=0; j<students[num-1].length; j++){
					sum+=students[num-1][j];
				}
				System.out.print(sum+"\t| ");
				System.out.print(sum*100/students[num-1].length/100.0);
				System.out.println();
				
			}else if(input==4){
				// 수정
				int num=numInput("수정할 학번>",1,tot);
				String[] lec={"국어","영어","수학"};
				for(int i=0; i<students[num-1].length; i++){
					students[num-1][i]=numInput(num+"번 학생 "+lec[i]+">",0,100);
				}
				
			}else{
				System.out.println("ERR)입력오류");
			}
			
		}
	}

	public static int numInput(String msg, int min, int max){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int su=-9999999;
		while(true){
			try{
				System.out.print(msg);
				su=sc.nextInt();
			}catch(java.util.InputMismatchException e){
				sc=new java.util.Scanner(System.in);
				System.out.println(min+"~"+max+"사이의 숫자를 입력하세요");
			}
			if(min<=su&&su<=max){break;}
		}
		return su;
	}
}








