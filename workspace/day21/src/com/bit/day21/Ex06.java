package com.bit.day21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex06 {

	public static void main(String[] args) {
		// 
		File file = new File("test06.bin");
		
		RandomAccessFile raf=null;
		
		try {
			raf=new RandomAccessFile(file, "rw");
			raf.write("abcefg".getBytes());
			
			raf.seek(0);
			while(true){
				int su=raf.read();
				if(su==-1){break;}
				System.out.println((char)su);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
