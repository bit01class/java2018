package com.bit.day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Ex02 {

	public static void main(String[] args) {
		InputStream inn = System.in;
		InputStreamReader isr=null;
		BufferedReader br=null;
		String url="";
		InetAddress[] arr=null;
		try {
			isr=new InputStreamReader(inn);
			br=new BufferedReader(isr);
			System.out.print("주소를 입력:");
			url=br.readLine();
			arr = InetAddress.getAllByName(url);
			for(int i=0; i<arr.length; i++){
				System.out.println(arr[i].getHostAddress());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
















