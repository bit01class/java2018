package com.bit.day21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		StreamTokenizer stken=null;
		try {
			fr=new FileReader("test.txt");
			stken=new StreamTokenizer(fr);
			
			while(stken.nextToken()!=StreamTokenizer.TT_EOF){
				switch (stken.ttype) {
				case StreamTokenizer.TT_WORD:
					System.out.println(stken.sval);
					break;
				case StreamTokenizer.TT_NUMBER:
					System.out.println(stken.nval);
					break;

				default:
					break;
				}
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
	}

}



















