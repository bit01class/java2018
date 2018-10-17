package com.bit.day25;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Ex05 {

	public static void main(String[] args) {
		URL url=null;
		URLConnection conn =null;
		try {
//			url=new URL("https://raw.githubusercontent.com/bit01class/java2018/master/workspace/day25/good1.jpg");
			url=new URL("https://github.com/bit01class/java2018/blob/master/workspace/day25/good1.jpg");
			conn = url.openConnection();
			conn.connect();
			System.out.println("타입:"+conn.getContentType());
			System.out.println("크기:"+conn.getContentLength());
			System.out.println("수정일:"+new Date(conn.getLastModified()));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
