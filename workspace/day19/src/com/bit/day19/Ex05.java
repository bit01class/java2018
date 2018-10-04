package com.bit.day19;

import java.io.File;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		File file =new File("test02.txt");
//		boolean result=file.createNewFile();
//		System.out.println(result);
		///////////////////////////////////
//		File file2 = new File("temp");
//		boolean result2=file2.mkdir();
//		System.out.println(result2);
		///////////////////////////////////
//		File file3=new File("temp2");
//		if(file3.mkdir()){
//			File file4=new File(".\\temp2\\test03.txt");
//			file4.createNewFile();
//			System.out.println("ok");
//		}
		///////////////////////////////////
		File file5=new File("temp3");
		file5.mkdir();
		File file6=new File("temp3","test04.txt");
		file6.createNewFile();
		
	}

}





















