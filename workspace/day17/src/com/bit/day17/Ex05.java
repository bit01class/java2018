package com.bit.day17;

import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) throws Exception {
		// crud
		StringBuffer str1= new StringBuffer("java");
		StringBuffer str2= new StringBuffer("Web");
		
		// +
		str1.append(str2);
		str1.append("Spring");
		
		// delete
		//str1.delete(4, 7);
		
		// update
//		str1.replace(4, 7, "DB");
//		str1.replace(4, 4, "DB");
		str1.insert(4, "Db");
		
		System.out.println(str1);
		
	}

}










