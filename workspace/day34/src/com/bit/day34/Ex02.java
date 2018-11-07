package com.bit.day34;

import java.lang.reflect.Method;

class Target{
	int su=1234;
	void func01(){}
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Target obj=new Target();
		
		Class clz;
		try {
			clz = Class.forName("com.bit.day34.Target");
//			Target obj=(Target)clz.newInstance();
			Method[] sh = clz.getDeclaredMethods();
			for(int i=0; i<sh.length; i++){
				System.out.println(sh.toString());
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
