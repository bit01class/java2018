package com.bit.day21;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex03 {

	public static void main(String[] args) {
		// 
		String msg = "한글 입력 잘되길...";
		File file = new File("test.txt");
		
		char[] chs=msg.toCharArray();
		
		OutputStream os=null;
		OutputStreamWriter osw=null;
		try {
			file.createNewFile();
			
			os=new FileOutputStream(file);
			osw=new OutputStreamWriter(os);
			
			osw.write(chs);
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				osw.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}





















