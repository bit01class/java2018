package com.bit.day14;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func01(1);
	}
	
	public static void func01(int su){
		try{
			System.out.println("�����մϴ�");
			if(su==0)return;
		}finally{
			System.out.println("�������ϴ�");
		}
	}
}











