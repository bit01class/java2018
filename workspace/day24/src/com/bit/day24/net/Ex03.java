package com.bit.day24.net;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex03 {

	public static void main(String[] args) {
		File file = new File("./index.html");
		URL url=null;
		URLConnection conn=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		Writer fw=null;
		PrintWriter pw=null;
		try {
			file.createNewFile();
			fw=new FileWriter(file);
			pw=new PrintWriter(fw);
			url=new URL("http://www.seoul.go.kr/main/index.html");
			conn = url.openConnection();
			is=conn.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			String msg=null;
			while((msg=br.readLine())!=null){
				pw.println(msg);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}






















