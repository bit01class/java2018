package com.bit.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) {
		// 바이트스트림(1byte)
		String msg="A";
		System.out.println(msg.getBytes().length);
		File file = new File("./test01.txt");
//		FileOutputStream os=null;
		OutputStream os=null;
		try {
			file.createNewFile();
			os=new FileOutputStream(file);
			os.write(msg.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		InputStream is=null;
		try {
			is=new FileInputStream(file);
			int su=is.read();
			int su2=is.read();
			System.out.println(su);
			System.out.println(su2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("종료");
		
		
		
	}

}























