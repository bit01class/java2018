package com.bit.day20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader("test03.txt");
			br=new BufferedReader(fr);
			String msg="";
			while((msg=br.readLine())!=null){
				System.out.println(msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}















