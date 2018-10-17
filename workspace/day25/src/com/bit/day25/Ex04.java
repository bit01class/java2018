package com.bit.day25;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex04 {

	public static void main(String[] args) {
		URL url=null;
			try {
				url=new URL("https://github.com/bit01class/java2018");
				System.out.println(url.getProtocol());
				System.out.println(url.getDefaultPort());
				System.out.println(url.getPort());
				System.out.println(url.getHost());
				System.out.println(url.getFile());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
	}

}
