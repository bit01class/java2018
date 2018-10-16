package com.bit.day24.net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		InetAddress addr1=null;
		InetAddress[] addr2=null;
		
		try {
			addr1=InetAddress.getByName("naver.com");
//			addr1=InetAddress.getLocalHost();
			addr2=InetAddress.getAllByName("naver.com");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println(addr1.getHostAddress());
		System.out.println(addr1.getHostName());
		System.out.println(Arrays.toString(addr1.getAddress()));
		System.out.println("------------------------------------");
		for(int i=0; i<addr2.length; i++){
			System.out.println(addr2[i].getHostAddress());
		}
		
	}

}
