package com.bit.day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		File file = new File("test09.txt");
		try {
			if(file.createNewFile()){
				System.out.println("파일 생성");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String msg = "한글로 작성중...";
		
		byte[] arr = msg.getBytes();
		FileOutputStream os = null;
		try {
			os = new java.io.FileOutputStream(file);
//			for(int i=0; i<arr.length; i++){
//				byte by=arr[i];
//				os.write(by);
//			}
			os.write(arr,0,arr.length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		

	}

}




















