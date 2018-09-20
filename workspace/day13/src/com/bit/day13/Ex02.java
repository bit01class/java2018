package com.bit.day13;

public class Ex02 {
	final static String bar="------------------------------------";
	final static String title="주민번호 검사";
	final static String menu="주민번호를 입력하세요>";
	
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String result="당신은 ";
		String input=null;
		System.out.println(bar+"\n"+title+"\n"+bar);
		do{
			System.out.print(menu);
			input=sc.nextLine();
			
			if(input.isEmpty()){
				continue;
			}else if(input.indexOf("-")<0){
				System.out.println("'-'를 생략하지 마세요");
				continue;
			}else if(input.length()!=14){
				System.out.println("잘못된 주민번호 입니다");
				continue;
			}else if(input.indexOf("-")!=6){
				System.out.println("'-'가 잘못 들어갔습니다");
				continue;
			}else{
				// 2018 -1900-99+1=2018-1900+1-99=119-99=100+19-99
				// 2018 -2000-00+1=2018-2000+1-00=19-00=100+19-99-100
				
				String su2=input.substring(0, 2);
				int age=219-Integer.parseInt("1"+su2);
				String su1=input.substring(7,8);
				int su=Integer.parseInt(su1);
				if(su<1||su>4){
					System.out.println("잘못된 주민번호 입니다");
					continue;
				}
				if(su>2){age-=100;}
					result+=age;
				if(su%2==0){
					result+="살 여자입니다";
				}else{
					result+="살 남자입니다";
				}
				System.out.println(result);
				break;
			}
		}while(true);
	}

}
















