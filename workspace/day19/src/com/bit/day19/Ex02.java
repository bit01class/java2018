package com.bit.day19;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 C:\java\workspace\day19 ���͸�

2018-10-04  ���� 09:51    <DIR>          .
2018-10-04  ���� 09:51    <DIR>          ..
2018-10-04  ���� 09:37               301 .classpath
2018-10-04  ���� 09:37               381 .project
2018-10-04  ���� 09:37    <DIR>          .settings
2018-10-04  ���� 09:37    <DIR>          bin
2018-10-04  ���� 09:37    <DIR>          src
2018-10-04  ���� 09:51    <DIR>          temp
2018-10-04  ���� 09:49                 0 test01.txt
               3�� ����                 682 ����Ʈ
               6�� ���͸�

*/
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fileCnt=0;
		int dirCnt=0;
		int fileTotalSize=0;
		File file = new File("C:\\");
		String[] arr = file.list();
		String[] arr2=new String[arr.length+2];
		arr2[0]=".";
		arr2[1]="..";
		System.arraycopy(arr, 0, arr2, 2, arr.length);
		
		for(int i=0; i<arr2.length; i++){
			//System.out.println(arr[i]);
			File temp=new File(arr2[i]);
			//2018-10-04  ���� 09:49
			//System.out.print(temp.lastModified()+"\t");
			long time=temp.lastModified();
			String pattern="yyyy-MM-dd a hh:mm";
			
			Date date=new Date(time);
			java.text.SimpleDateFormat sdf=new SimpleDateFormat(pattern);
			System.out.print(sdf.format(date)+"\t");
			
			if(temp.isDirectory()){
				dirCnt++;
				System.out.print("<DIR>"+"\t");
				System.out.print("\t");								
			}else{
				fileCnt++;
				fileTotalSize+=temp.length();
				System.out.print("\t");				
				System.out.print(temp.length()+"\t");				
			}
			
			System.out.println(temp.getName());
		}
		System.out.println();
		System.out.println("\t\t"+fileCnt+"�� ����"+"\t\t"+fileTotalSize+"����Ʈ");
		System.out.println("\t\t"+dirCnt+"�� ���丮");
		
		
	}

}






















