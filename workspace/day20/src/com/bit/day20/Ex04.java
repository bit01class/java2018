package com.bit.day20;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./test03.txt");
		char[] cbuf=new char[5];
		Reader fr=null;
		Writer fw=null;
		String temp="";
		try {
			file.createNewFile();
//			fr=new FileReader(file);
//			System.out.println("읽기 시작");
//			while(true){
//				int su=0;
//				if((su=fr.read(cbuf,0,cbuf.length))<0){break;}
//				temp+=new String(cbuf,0,su);
//			}
//			System.out.println("읽기 종료");
//			fw=new FileWriter(file);
//			fw.write(temp);
//			fw.write("ABCDEFG");
//			fw.flush();
			fr=new FileReader("test03.txt");
			fw=new FileWriter("test33.txt",false);
			while(true){
				int su=0;
				if((su=fr.read(cbuf,0,cbuf.length))<0){break;}
				fw.write(cbuf,0,su);				
				fw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("작성끝");
	}

}
