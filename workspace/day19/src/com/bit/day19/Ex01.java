package com.bit.day19;

import java.io.File;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// IO
		// File
//		String path="C:\\java\\workspace\\day19\\test01.txt";// ������
		String path="C:/java/workspace/day19/test01.txt";// ������
//		String path="C:/java/workspace/day19/./.././day19/test01.txt";
//		String path="test01.txt"; // �����
//		String path=".\\test01.txt"; // �����
		java.io.File file=new File(path);
		System.out.println("������������:"+file.exists());
		System.out.println("���丮:"+file.isDirectory());
		System.out.println("����:"+file.isFile());
		System.out.println("���:"+file.getPath());
		System.out.println("������1:"+file.getAbsolutePath());
		System.out.println("������2:"+file.getCanonicalPath());
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

















