package com.bit.day20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Ex08 {

	public static void main(String[] args) {
		// ���ڷ��̼� ����
		
		Writer fw=null;// ��� ��Ʈ��
		PrintWriter pw=null; // ���� ��Ʈ��
		BufferedWriter bw=null;
		try {
			fw=new FileWriter("test08.txt");// io
			pw=new PrintWriter(fw);
			bw=new BufferedWriter(pw);
			
//			pw.println("�̷��� �ص� �߳��ɴϴ�");
			bw.write("�߳��ñ�?12123255".toCharArray());
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
		System.out.println("�ۼ��Ϸ�");
	}

}


























