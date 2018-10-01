package com.bit.day17;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * (배열)
 * ---------------------------------------
 * BBS - 게시판(ver 0.0.1)
 * ------------------------------------------
*/
public class Ex01 {

	public static void main(String[] args) {
		// ~jdk1.6
//		ArrayList<String[]> list = new ArrayList<String[]>();
		// jdk1.7~
		ArrayList<String[]> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String menu="1.목록 2.글쓰기 3.내용 (4.수정 5.삭제) 0.종료> ";
		String title="---------------------------------------";
		title+="\nBBS - 게시판(ver 0.0.1)\n";
		title+="---------------------------------------";
		String input="";
		
		System.out.println(title);
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if("0".equals(input)){
				break;
			}else if("1".equals(input)){
				//목록출력
				String header="-----------------------------------------\n글번호	| 제목(10이내)\n-----------------------------------------";
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
				//글쓰기
				String[] row=new String[2];
				System.out.print("제목>");
				row[0]=sc.nextLine();
				if("".equals(row[0])){
					row[0]="제목없음";
				}
				System.out.print("내용>");
				row[1]=sc.nextLine();
				list.add(row);
				
			}else if("3".equals(input)){
				
				System.out.print("글번호>");
				input=sc.nextLine();
				
				int idx=-1;
				try{
					idx=Integer.parseInt(input)-1;
				}catch(NumberFormatException e){
				}
				if(idx<list.size() && idx>=0){
					String[] temp=list.get(idx);
					System.out.println("-----------------------------------------");
					System.out.println("제목 | "+temp[0]);
					System.out.println("-----------------------------------------");
					System.out.println("내용 | "+temp[1]);
					System.out.println("-----------------------------------------\n\n");
				}else{
					System.out.println("글번호를 다시 확인하시고 입력하세요");
				}
			}
		}//while end
		
	}//main end

}//class end

































