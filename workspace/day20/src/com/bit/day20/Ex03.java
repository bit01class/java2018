package com.bit.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test02.txt");
		String result="";
		char[] cbuf=new char[100];
		Reader fr=null;
		try {
			fr=new FileReader(file);
//			int su=fr.read();
//			System.out.println(su);
//			for(int i=0; i<6; i++){
//				System.out.println((char)fr.read());
//			}
//			fr.read(cbuf);
//			System.out.println(Arrays.toString(cbuf));
			int cnt=0;
			while(true){
				cnt=fr.read(cbuf,0,cbuf.length);
				if(cnt<0){break;}
				result+=new String(cbuf,0,cnt);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(result);
	}

}



















