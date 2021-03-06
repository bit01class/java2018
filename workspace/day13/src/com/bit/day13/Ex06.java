package com.bit.day13;

import java.io.InputStream;

/*
 * 주민번호 확인
 * --------------
 * 주민번호를입력>1234561234567
 * 입력하신 주민번호는 123456-1234567입니다
 * 
 * 주민번호를입력>123456-1234567
 * '-'를 생략하고 작성하세요
 * ----------------------------
 * 
 * 0001010000000
 * min=1010000000
 * max=9912312000000
 * 1234561234567
 * (int)1234561234567-1234560000000
 * 
 * 123456-1234567
 * 
*/
public class Ex06 {

	public static void main(String[] args) {
		InputStream is = System.in;
		java.util.Scanner sc = new java.util.Scanner(is);
		long jumin=0;
		
		System.out.println("-------------------------------------\n주민번호 확인\n----------------------------------");
		boolean result=true;
		while(result){
			System.out.print("주민번호 입력>");
			try{
			jumin=sc.nextLong();
			}catch(java.util.InputMismatchException e){
				System.out.println("숫자만 입력하세요");
				sc=new java.util.Scanner(is);
				continue;
			}
			//min=1010000000
			//max=9912312999999
			if(jumin<1010000000L || jumin>9912312999999L){
				System.out.println("다시 확인하시고 입력하세요(잘못된 주민번호)");
				continue;
			}
			System.out.print("입력하신 주민번호는 ");
			System.out.print(jumin/10000000);
			System.out.print('-');
			System.out.println(jumin-jumin/10000000*10000000+"입니다");
			result=false;
		}
	}

}




















