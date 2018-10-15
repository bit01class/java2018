package com.bit.day20;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cbuf=new char[5];
		FileReader fr=null;
		CharArrayWriter caw=null;
		FileWriter fw=null;
		CharArrayReader car=null;
		int su=0;
		try {
			fr=new FileReader("test03.txt");
			caw=new CharArrayWriter();
			while((su=fr.read(cbuf))!=-1){
				caw.write(cbuf, 0, su);
			}
			
			car=new CharArrayReader(caw.toCharArray());
			fw=new FileWriter("test12.txt");
			while((su=car.read(cbuf))!=-1){
				fw.write(cbuf,0,su);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				car.close();
				fw.close();
				caw.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}










