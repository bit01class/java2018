package com.bit.day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="big.jpg";
		String target="copy.jpg";
		byte[] buff=new byte[5];
		InputStream is=null;
		OutputStream os=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			is=new FileInputStream(fileName);
			os=new FileOutputStream(target);
			
			bis=new BufferedInputStream(is);
			bos=new BufferedOutputStream(os);
			int cnt=0;
			while((cnt=bis.read(buff))!=-1){
				bos.write(buff,0,cnt);
			}
//			int result=0;
//			while((result=is.read(buff))!=-1){
//				os.write(buff,0,result);
//			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				bos.close();
				os.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("복사완료");
	}

}
























