package com.bit.day12;
/*
 * "Java Web Spring"
 * 
 * Q1. �빮���� ������ ���Ͻÿ� 
 * 
 * Q2. �빮�ڸ� �ҹ��ڷ� ��ȯ�Ͻÿ�
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
		System.out.println("�빮��:"+cnt1);
		System.out.println("�ҹ���:"+cnt2);
		System.out.println("����:"+cnt3);
		System.out.println("���:"+result);
	}

}













