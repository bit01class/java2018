package com.bit.day20;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test09.bin");
		OutputStream os=null;
		DataOutputStream dos=null;
		
		try {
			os=new FileOutputStream(file);
			dos=new DataOutputStream(os);
			
			dos.write(97);
			dos.writeInt(97);
			dos.writeDouble(3.14);
			dos.writeBoolean(true);
			dos.writeChar('@');
			dos.writeUTF("이렇게 입력함");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			
			try {
				dos.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("작성완료");
		}
	}

}






















