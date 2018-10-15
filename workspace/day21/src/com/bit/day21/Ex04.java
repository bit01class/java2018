package com.bit.day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is=null;
		InputStreamReader isr=null;
		
		try {
			is=new FileInputStream("test.txt");
			isr=new InputStreamReader(is);
			while(true){
				int su=isr.read();
				if(su==-1){break;}
				System.out.print((char)su);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}






















