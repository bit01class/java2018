package com.bit.day20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Ex08 {

	public static void main(String[] args) {
		// 데코레이션 패턴
		
		Writer fw=null;// 기반 스트림
		PrintWriter pw=null; // 보조 스트림
		BufferedWriter bw=null;
		try {
			fw=new FileWriter("test08.txt");// io
			pw=new PrintWriter(fw);
			bw=new BufferedWriter(pw);
			
//			pw.println("이렇게 해도 잘나옵니다");
			bw.write("잘나올까?12123255".toCharArray());
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				bw.close();
				pw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("작성완료");
	}

}


























