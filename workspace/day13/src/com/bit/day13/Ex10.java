package com.bit.day13;

public class Ex10 {

	public static void main(String[] args) {
		int[] arr={-2,-1,0,1,2};
		for(int i=0; i<arr.length; i++){
			try{
				int result = 10/arr[i];
				System.out.println(result);
			}catch(ArithmeticException err){
				//System.out.println(err.toString());
				err.printStackTrace();
			}
		}
//		try{
//			int result = 10/0;
//			System.out.println(result);
//		}catch(ArithmeticException err){
//			System.out.println("����ȸ��");
//			System.out.println(err);
//			System.out.println(err.toString());
//			System.out.println(err.getMessage());
//			err.printStackTrace();
//		}
	}

}
