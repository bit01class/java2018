package com.bit.day20;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File target =new File("test09.bin");
		
		InputStream is=null;
		DataInputStream dis=null;
		
		try {
			is=new FileInputStream(target);
			dis=new DataInputStream(is);
			
			int su=dis.read();
			System.out.println("read:"+su);
			
			int su2=dis.readInt();
			System.out.println("readInt:"+su2);
			
			boolean boo=dis.readBoolean();
			System.out.println("readBoolean:"+boo);
			
			double su3=dis.readDouble();
			System.out.println("readDouble:"+su3);
			
			char ch=dis.readChar();
			System.out.println("readChar:"+ch);
			
			String msg = dis.readUTF();
			System.out.println("String:"+msg);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				dis.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
























