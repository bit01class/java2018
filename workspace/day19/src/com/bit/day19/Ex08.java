package com.bit.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.io.InputStream input = System.in;// 1πŸ¿Ã∆Æ
		java.io.OutputStream out = System.out;
		int su=0;
		try {
			while(su!=13){
				su =input.read();
				System.out.println(su);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}



















