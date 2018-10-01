package com.bit.day17;

import java.util.ArrayList;
// 게시판
import java.util.Scanner;

class Bbs{
	String subject;
	String content;
	
	public Bbs() {
		subject="제목없음";
	}
	
	void showSub(){
		System.out.println("제목 | "+subject);
	}
	void showContent(){
		System.out.println("내용 | "+content);
	}
	void show(){
		System.out.println(subject+"\t| "+content);
	}
}

public class Ex03 {
	ArrayList<Bbs> list=new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	String title;
	String menu;
	String header;
	
	
	public Ex03() {
		title="---------------------------------------";
		title+="\nBBS - 게시판(ver 0.0.3)\n";
		title+="---------------------------------------";
		menu="1.목록 2.글쓰기 3.내용 4.수정 5.삭제 0.종료> ";
		header="-----------------------------------------" +
				"\n글번호	| 제목(10이내)\n" +
				"-----------------------------------------";
	}

	public static void main(String[] args) {
		new Ex03().programStart();
	}
	
	public void programStart(){
		System.out.println(title);
		int su=0;
		while((su=inputSu(menu))!=0){
			if(su==1){
				System.out.println(header);
				for(int i=0; i<list.size(); i++){
					Bbs row = list.get(i);
					System.out.println(i+1+"\t| "+row.subject);
				}
			}else if(su==2){
				Bbs ele=new Bbs();
				System.out.print("제목> ");
				String temp=sc.nextLine();
				if(!temp.trim().isEmpty()){
					ele.subject=temp;
				}
				System.out.print("내용> ");
				ele.content=sc.nextLine();
				
				list.add(ele);
			}else if(su==3){
				int idx=inputSu("글번호>")-1;
				if(idx<list.size()){
					Bbs row = list.get(idx);
					System.out.println("---------------------------------");
					row.showSub();
					System.out.println("---------------------------------");
					row.showContent();
					System.out.println("---------------------------------");
				}else{
					System.out.println("글번호 다시 확인하세요");
				}
			}else if(su==4){
				int idx=inputSu("수정할 글번호>")-1;
				if(idx<0 || idx>=list.size()){
					System.out.println("글번호 다시 확인하세요");
					continue;
				}
				Bbs row = list.get(idx);
				System.out.print("제목> ");
				String temp=sc.nextLine();
				if(!temp.trim().isEmpty()){
					row.subject=temp;
				}
				System.out.print("내용> ");
				row.content=sc.nextLine();
			}else if(su==5){
				try{
					list.remove(inputSu("삭제할 글번호>")-1);
				}catch(IndexOutOfBoundsException e){
					System.out.println("없는 글번호입니다 다시확인하세요");
				}
			}else{
				
			}// if end
		}// while end
	}// program end
	public int inputSu(String msg){
		System.out.print(msg);
		int su=-1;
//		try{
//			su=Integer.parseInt(temp);
//		}catch(NumberFormatException e){
//			su=inputSu(msg);
//		}
		while(su<0){
			try{
				String temp=sc.nextLine();
				su=Integer.parseInt(temp);
			}catch(NumberFormatException e){
				System.out.println("0이상의 숫자를 입력하세요");
				System.out.print(msg);
			}
		}
		return su;
	}// inputSu end

}























