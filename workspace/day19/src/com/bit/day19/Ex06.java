package com.bit.day19;

import java.io.File;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		File file2=new File("test02.txt");
		boolean result=file.renameTo(file2);
		System.out.println("¼öÁ¤:"+result);
	}

}
