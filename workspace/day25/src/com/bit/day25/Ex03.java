package com.bit.day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex03 {

	public static void main(String[] args) {
		URL url=null;
		InputStream in = null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			url=new URL("https://github.com/bit01class/java2018");
			
			in = url.openStream();
			isr=new InputStreamReader(in);
			br=new BufferedReader(isr);
			
			while(true){
				String msg=br.readLine();
				if(msg==null){break;}
				System.out.println(msg);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}




