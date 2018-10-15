package com.bit.day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream inn = System.in;
		PrintStream oout = System.out;
		
		File file = new File("test.txt");
		
		InputStream fileInput = new FileInputStream(file);
		
		Scanner sc = new Scanner(file);
		String msg=sc.nextLine();
		System.out.println(msg);
	}

}





















