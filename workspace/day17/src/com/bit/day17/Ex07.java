package com.bit.day17;

import java.util.StringTokenizer;

public class Ex07 {

	public static void main(String[] args) {
		String msg="    java DB DB  web spring";
		
		String[] data = msg.split(" "); // ""
		System.out.println("size:"+data.length);
		for(int i=0; i<data.length; i++){
			System.out.println(data[i]);
		}
		System.out.println("---------------------------------");
		java.util.StringTokenizer sttk=new StringTokenizer(msg);
		System.out.println("size:"+sttk.countTokens());
		String[] data2=new String[sttk.countTokens()];
		int cnt=0;
		while(sttk.hasMoreTokens()){
			data2[cnt++]=sttk.nextToken();
		}
		for(int i=0; i<data2.length; i++){
			System.out.println(data2[i]);
		}
		
	}

}
















