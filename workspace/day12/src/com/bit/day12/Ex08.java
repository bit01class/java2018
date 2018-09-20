package com.bit.day12;
/*
 * "Java Web Spring"
 * 
 * Q1. 대문자의 갯수를 구하시오 
 * 
 * Q2. 대문자를 소문자로 변환하시오
 * 
 * 
 * 
*/
public class Ex08 {
	public static void main(String[] args) {
		// 
		String target="Java Web Spring";
		String result="";
		int cnt1=0;
		int cnt2=0;
		int cnt3=0;
		for(int i=0; i<target.length(); i++){
			if(Character.isUpperCase(target.charAt(i))){
				result+=Character.toLowerCase(target.charAt(i));
				cnt1++;
			}else if(Character.isLowerCase(target.charAt(i))){
				result+=Character.toUpperCase(target.charAt(i));
				cnt2++;
			}else if(Character.isWhitespace(target.charAt(i))){
				result+=target.charAt(i);
				cnt3++;
			}
		}
		System.out.println("대문자:"+cnt1);
		System.out.println("소문자:"+cnt2);
		System.out.println("띄어쓰기:"+cnt3);
		System.out.println("결과:"+result);
	}

}














