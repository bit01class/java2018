package com.bit.day13;

import java.io.InputStream;
/*
 * 
 * 123456-1234567
 * '1''2''3''4''5''6''-''1''2''3''4''5''6''7'
 * ���̻�����-���̻�����ĥ
 * 
*/
public class Ex07 {

	public static void main(String[] args) {
		//�ѱ�ó��(�ѱ۸�)
		char[] hangle={'��','��','��','��','��','��','��','ĥ','��','��'};
		
		InputStream is = System.in;
		java.util.Scanner sc = new java.util.Scanner(is);
		String input=null;
		
		System.out.println("-------------------------------------\n�ֹι�ȣ Ȯ��\n----------------------------------");
		boolean result=true;
		while(result){
			System.out.print("�ֹι�ȣ �Է�>");
			input=sc.nextLine();
			
			for(int i=0; i<input.length(); i++){
				if(Character.isDigit(input.charAt(i))){
					System.out.println("�Է¿���");
					continue;
				}else if(input.charAt(6)!='-'){
					System.out.println("�Է¿���");
					continue;
				}
			}
			int idx=0;
			for(int i=0; i<input.length(); i++){
				if(i==6){
					System.out.print('-');
					continue;
					}
				char target=input.charAt(i);
				idx=0;
				for(idx=0; idx<hangle.length; idx++){
					if(target==hangle[idx]){break;}
				}
				if(idx==10){
					System.out.println("�Է¿���");
					break;
				}
				System.out.print(idx);
			}
			if(idx!=10)result=false;
		}
	}

}





























