package com.bit.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader fr=null;
		Writer fw=null;
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		PrintWriter pw=null;
		
		try {
			fr=new FileReader("test03.txt");
			fw=new FileWriter("test07.txt");
			
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);
			
			pw=new PrintWriter(bw);
			
			String msg="";
			
			while((msg=br.readLine())!=null){
//				bw.write(msg);
////				bw.write('\r');
////				bw.write('\n');
//				bw.newLine();
				pw.println(msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				bw.close();
				br.close();
				fw.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}










































