package com.bit.day20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex02 {

	public static void main(String[] args) {
		// ���ڿ� ��Ʈ��(2byte)
		String msg="���ڿ���Ʈ��";
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




















