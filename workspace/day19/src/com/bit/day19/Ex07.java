package com.bit.day19;

import java.io.File;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		// �ӽ�����
		File file = new File("test.txt");
		File tempDir=new File("C:\\java\\workspace\\day19\\temp");
		String prefix="day19";
		String suffix=".class01";
		File temp=File.createTempFile(prefix, suffix, tempDir);
		System.out.println(temp.getCanonicalPath());
//		temp.deleteOnExit();// �ӽ����� ����
		System.out.println("�ӽ����� ����");
	}

}
