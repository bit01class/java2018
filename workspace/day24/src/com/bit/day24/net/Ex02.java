package com.bit.day24.net;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		URL url =null;
		try {
			url=new URL("http://210.89.160.88");
			
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getContent());
			System.out.println(url.getPath());
			System.out.println(url.getFile());
			System.out.println(url.toExternalForm());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}



















