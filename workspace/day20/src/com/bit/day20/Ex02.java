package com.bit.day20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex02 {

	public static void main(String[] args) {
		// 문자열 스트림(2byte)
		String msg="문자열스트림";
		char[] temp=msg.toCharArray();
		System.out.println(temp.length);
		File file = new File("./test02.txt");
		Writer fw=null;
		try {
			file.createNewFile();
			fw=new FileWriter(file);
			
			fw.write(temp);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}




















