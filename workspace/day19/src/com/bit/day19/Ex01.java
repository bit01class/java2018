package com.bit.day19;

import java.io.File;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// IO
		// File
//		String path="C:\\java\\workspace\\day19\\test01.txt";// 절대경로
		String path="C:/java/workspace/day19/test01.txt";// 절대경로
//		String path="C:/java/workspace/day19/./.././day19/test01.txt";
//		String path="test01.txt"; // 상대경로
//		String path=".\\test01.txt"; // 상대경로
		java.io.File file=new File(path);
		System.out.println("파일존재유무:"+file.exists());
		System.out.println("디렉토리:"+file.isDirectory());
		System.out.println("파일:"+file.isFile());
		System.out.println("경로:"+file.getPath());
		System.out.println("절대경로1:"+file.getAbsolutePath());
		System.out.println("절대경로2:"+file.getCanonicalPath());
		String path1=file.getAbsolutePath();
		String path2=file.getPath();
		System.out.println(path1.replace(path2, "")+file.getName());
		System.out.println(path1.replace(path2, ""));
		System.out.println(file.getParent());
		System.out.println("r:"+file.canRead());
		System.out.println("w:"+file.canWrite());
		System.out.println("x:"+file.canExecute());
		System.out.println("size:"+file.length());
		System.out.println(file.lastModified());
	}

}

















