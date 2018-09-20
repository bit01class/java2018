package com.bit.day13;
/* -----------------------------
 * 주민번호 검사
 * -----------------------------
 * 주민번호를 입력하세요>123456-1234567
 * 당신은 00살 남자입니다
 * 
 * 주민번호를 입력하세요>123456-2234567
 * 당신은 00살 여자입니다
 * 
 * 주민번호를 입력하세요>일이삼사오육-일이삼사오육칠
 * 당신은 00살 여자입니다
 * 
 * ------------------------------------
 * 
 * 주민번호 특징
 * 6자리-7자리
 * 2-년도	-	첫자리 숫자
 * 99 		-	1남자, 2여자
 * 							, (9 외국인)
 * 00		-	3남자, 4여자
 * 
 * ------------------------------------
 * 주민번호를 입력하세요>1234562234567
 * '-'를 생략하지 마세요
 * 주민번호를 입력하세요>
 * 
 * 주민번호를 입력하세요>123456-12345678
 * 주민번호 형식은 000000-0000000입니다
 * 주민번호를 입력하세요>12345-61234567
 * 주민번호 형식은 000000-0000000입니다
 * 주민번호를 입력하세요>1234561-234567
 * 주민번호 형식은 000000-0000000입니다
 * 
*/
public class Ex01 {
	final static String bar="------------------------------------";
	final static String title="주민번호 검사";
	final static String menu="주민번호를 입력하세요>";

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input="";
		
		System.out.println(bar);
		System.out.println(title);
		System.out.println(bar);
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			
			char[] temp=input.toCharArray();
			int cnt=0;
			for(int i=0; i<temp.length; i++){
				if(temp[i]=='-'){cnt++;}
			}
			if(cnt!=1){
				System.out.println("'-'를 생략하지 마세요");
				continue;
			}
			
			if(temp.length!=14 || temp[6]!='-'){
				System.out.println("주민번호 형식은 000000-0000000입니다");
				continue;
			}
			
			int year=(temp[0]-'0')*10+temp[1]-'0';
			int age=1;
			if(temp[7]=='1'||temp[7]=='2'){
				age+=2018-(1900+year);
			}else if(temp[7]=='3'||temp[7]=='4'){
				age+=2018-(2000+year);
			}
			
			if(temp[7]=='1'|| temp[7]=='3'){
				temp[7]='남';
			}else if(temp[7]=='2'||temp[7]=='4'){
				temp[7]='여';
			}
			
			System.out.println("당신은 "+age+"살 "+temp[7]+"자입니다");
			break;
		}
	}

}












