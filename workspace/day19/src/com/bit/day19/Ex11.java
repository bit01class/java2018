package com.bit.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		File src=new File("test09.txt");
		File dist=new File("test11.txt");
		try {
			dist.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		byte[] buff=new byte[512];
		try {
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dist);
//			while(true){
//				int cnt=fis.read();
//				if(cnt==-1){break;}
//				fos.write(cnt);
//			}
			///////////////////////////////////////////
			while(true){
				int cnt=fis.read(buff,0,buff.length);
				if(cnt==-1){break;}
				fos.write(buff,0,cnt);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 복사 끝");
		

	}

}



















