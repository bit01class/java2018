package com.bit.day19;

import java.io.File;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		// 임시파일
		File file = new File("test.txt");
		File tempDir=new File("C:\\java\\workspace\\day19\\temp");
		String prefix="day19";
		String suffix=".class01";
		File temp=File.createTempFile(prefix, suffix, tempDir);
		System.out.println(temp.getCanonicalPath());
//		temp.deleteOnExit();// 임시파일 삭제
		System.out.println("임시파일 생성");
	}

}
