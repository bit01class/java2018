package com.bit.day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.bit.day20.MyObject;



public class Ex01 {

	public static void main(String[] args) throws IOException {
		File file =new File("c:\\java\\mydb.bin");
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;

		try {
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			
			MyObject obj=(com.bit.day20.MyObject) ois.readObject();
			System.out.println(obj.su);
			System.out.println(obj.name);
//			obj.func01();
//			obj.func02();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			fis.close();
		}
	}

}











