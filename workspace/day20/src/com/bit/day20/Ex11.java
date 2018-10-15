package com.bit.day20;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		// ByteArrayStream(output)
		byte[] buff = new byte[10];
		File file = new File("test03.txt");
		FileInputStream fis=null;
		ByteArrayOutputStream bos=null;
		
		FileOutputStream fos=null;
		ByteArrayInputStream bais=null;
		int su=0;
		try {
			fis=new FileInputStream(file);
			bos=new ByteArrayOutputStream();
			
			while((su=fis.read(buff))!=-1){
				bos.write(buff, 0, su);
			}
			byte[] arr = bos.toByteArray();
//			System.out.println(Arrays.toString(arr));
//			for(int i=0; i<arr.length; i++){
//				System.out.print((char)arr[i]);
//			}
//			String msg = new String(arr);
//			System.out.println(msg);
			fos=new FileOutputStream("test11.txt");
			bais=new ByteArrayInputStream(arr);
			
			while((su=bais.read(buff))!=-1){
			fos.write(buff, 0, su);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				bais.close();
				bos.close();
				
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
















