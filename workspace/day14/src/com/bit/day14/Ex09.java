package com.bit.day14;

import java.util.Scanner;

/*
 * ------------------------------------
 * 계산기(ver 0.0.2)
 * ------------------------------------
 * 입력>1000+1
 * 결과:2
 * 
 * 1+1=2
 * 2-1=1;
 * 2*1=2;
 * 3/2=1;
 * 3/2=1.xxx;
 * 4/2=2
 * 
*/
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>");
		String input=sc.nextLine();
		
		String[] temp=new String[2];
		char mark=' ';
		if(input.contains("+")){
			mark='+';
		}else if(input.contains("-")){
			mark='-';
		}else if(input.contains("*")){
			mark='*';
		}else if(input.contains("/")){
			mark='/';
		}else{
			
		}
		int idx=input.indexOf(mark);
		temp[0]=input.substring(0, idx);
		temp[1]=input.substring(idx+1);
		
		int[] su=new int[temp.length];
		for(int i=0; i<su.length; i++){
			su[i]=Integer.parseInt(temp[i]);
		}
		System.out.println("결과>"+func01(su,mark));
	}
	
	public static Number func01(int[] su,char mark){
		int result=0;
		switch (mark) {
		case '+':
			result=(su[0]+su[1]);
			break;
		case '-':
			result=su[0]-su[1];			
			break;
		case '*':
			result=su[0]*su[1];						
			break;
		case '/':
			if(su[0]%su[1]!=0){
				return 1.0*su[0]/su[1];
			}
			result=su[0]/su[1];						
			break;

		default:
			break;
		}
		return result;
	}
	
	

}












