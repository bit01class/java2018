package com.bit.day14;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func01(1);
	}
	
	public static void func01(int su){
		try{
			System.out.println("진행합니다");
			if(su==0)return;
		}finally{
			System.out.println("끝났습니다");
		}
	}
}












