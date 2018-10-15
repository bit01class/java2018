package com.bit.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		ArrayList<byte[]> list =new ArrayList<>();
		String msg="";
		byte[] arr=new byte[4];
		int cnt=0;
		File file = new File("test09.txt");
		if(file.exists()){
			FileInputStream fis =null;
			try {
				fis = new FileInputStream(file);
				while(true){
//					int read = fis.read();
//					if(read==-1){break;}
//					arr[cnt++]=(byte)read;
					////////////////////////
//					int read=fis.read(arr);
//					if(read==-1){break;}
//					msg+=new String(arr);
					////////////////////////
					int read=fis.read(arr,0,arr.length);
					if(read==-1){
						break;
					}
					
					byte[] arr2 = Arrays.copyOf(arr, read);
					cnt+=read;
					list.add(arr2);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}				
			}
			byte[] temp=new byte[cnt];
			int tot=0;
			for(int i=0; i<list.size(); i++){
				byte[] ele = list.get(i);
				System.arraycopy(ele, 0, temp, tot, ele.length);
				tot+=ele.length;
			}
			System.out.println(new String(temp));
			
			
			
			
		}
	}

}





















