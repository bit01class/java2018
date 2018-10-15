package com.bit.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex17 {

	public static void main(String[] args) throws IOException {
		com.bit.day20.MyObject obj=new MyObject();
		
		File file =new File("c:\\java\\mydb.bin");
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			oos.writeObject(obj);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			fos.close();
		}
		System.out.println("작성완료");
	}

}




















