package com.bit.day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {
	Scanner sc = new Scanner(System.in);
	ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
	String menu="1.목록 2.글쓰기 3.내용 4.수정 5.삭제 0.종료> ";

	public static void main(String[] args) {
		Ex02 me = new Ex02();
		me.programStart();
	}
	
	public void programStart(){
		String title="---------------------------------------";
		title+="\nBBS - 게시판(ver 0.0.2)\n";
		title+="---------------------------------------";
		String input="";
		System.out.println(title);
		boolean boo=true;
		while(boo){
			System.out.print(menu);
			input=sc.nextLine();
			switch (input) {
			case "0":
				boo=false;
				break;
			case "1":
				showList();
				break;
			case "2":
				listAdd();
				break;
			case "3":
				listOne();
				break;
			case "4":
				listEdit();
				break;
			case "5":
				listDel();
				break;
			default:
				break;
			}// switch end
		}//while end
	}// bbs end
	
	public void showList(){
		String header="-----------------------------------------\n글번호	| 제목(10이내)\n-----------------------------------------";
		System.out.println(header);
		for(int i=0; i<list.size(); i++){
			HashMap<String, String> map = list.get(i);
			System.out.print(i+1+"\t| ");
			int leng=map.get("sub").length();
			String dat="";
			if(leng>10){
				leng=10;
				dat="...";
			}
			System.out.print(map.get("sub").substring(0, leng));
			System.out.println(dat);
		}
	}// showList end
	
	public void listAdd(){
		HashMap<String, String> map=new HashMap<>();
		System.out.print("제목>");
		map.put("sub", sc.nextLine());
		System.out.print("내용>");
		map.put("cntnt", sc.nextLine());
		if(map.get("sub").equals("")){
			map.put("sub", "제목없음");
		}
		
		list.add(map);
	}// listAdd end
	
	public void listOne(){
		System.out.print("글번호>");
		try{
			int idx=Integer.parseInt(sc.nextLine())-1;
			HashMap<String, String> map = list.get(idx);
			System.out.println("----------------------------------------------");
			System.out.println("제목 | "+map.get("sub"));
			System.out.println("----------------------------------------------");
			System.out.println("내용 | "+map.get("cntnt"));
			System.out.println("----------------------------------------------");
		}catch(NumberFormatException e){
			System.out.println("숫자를 입력하세요");
			listOne();
		}catch(IndexOutOfBoundsException e){
			System.out.println("없는 글번호입니다");
			listOne();
		}
		
	}// listOne end
	
	public void listEdit(){
		System.out.print("글번호>");
		try{
			int idx=Integer.parseInt(sc.nextLine())-1;
			if(idx>=list.size()||idx<0){
				System.out.println("글번호를 다시 확인하세요");
				return;
			}
			HashMap<String,String> map = new HashMap<>();
			System.out.print("제목>");
			map.put("sub", sc.nextLine());
			System.out.print("내용>");
			map.put("cntnt", sc.nextLine());
			
			list.set(idx, map);
		}catch(NumberFormatException e){
			System.out.println("숫자를 입력하세요");
			listEdit();
		}
	}// listEdit end
	
	public void listDel(){
		System.out.print("글번호>");
		int idx=Integer.parseInt(sc.nextLine())-1;
		list.remove(idx);
	}// listDel end
}// class end
























