package com.bit.day12;

public class Ex10 {

	public static void main(String[] args) {
		// String Ŭ����
		String st1=new String("java");
		String st2="java";
		char[] ch1=new char[]{'j','a','v','a','W','e','b'};
		String st3=new String(ch1);
		
		System.out.println("ja"+"va");
		System.out.println("ja".concat("va"));
		System.out.println(st1.toString());
		char[] ch2=st1.toCharArray();
		for(int i=0; i<ch2.length; i++){
			System.out.println(ch2[i]);
		}
		System.out.println(st1==st2);
		System.out.println(st1.equals(st2));
		System.out.println("----------------------------------------");
		String st4=String.valueOf(ch2);
		System.out.println(st4);
		byte[] by1=new byte[]{65,66,67,68};
		String st5=new String(by1,1,2);
		System.out.println(st5);
		byte[] by2="�����ٶ�".getBytes();
		for(int i=0; i<by2.length; i++){
			System.out.print(by2[i]+" ");
		}
		System.out.println();
		String st6=new String(ch1,4,3);
		System.out.println(st6);
		char[] ch3=new char[4];
		byte[] by3=new byte[4];
		// void
		st1.getChars(0, 4, ch3, 0);// getChars(����index,������,������ char[], ���������ġ);
		st1.getBytes(0, 4, by3, 0);
		System.out.println(by3[0]);
		System.out.println(by3[1]);
		System.out.println(by3[2]);
		System.out.println(by3[3]);
//		System.out.println(ch3[4]);
//		System.out.println(ch3[5]);
		System.out.println("---------------------------------------");
		String st10="abcdABCDabcd";
		System.out.println(st10.charAt(3));
		System.out.println(st10.indexOf(65));
		System.out.println(st10.indexOf("bc"));
		System.out.println(st10.lastIndexOf('e'));
		System.out.println(st10.lastIndexOf("bc"));
		System.out.println((int)st10.charAt(3));
		System.out.println(st10.codePointAt(3));
		System.out.println("---------------------------------------");
		System.out.println(st10.toLowerCase());
		System.out.println(st10.toUpperCase());
		System.out.println(st10.contains("ABC"));
		System.out.println(st10.startsWith("a"));
		System.out.println(st10.endsWith("FG"));
		System.out.println(st10.replace("ABCD", ""));
		//st10=st10.replace("gA", "g1234A");
		System.out.println(st10.replaceFirst("abcd", "ABCD"));
		System.out.println(st10.substring(4, 8));
		System.out.println(st10.substring(4));
		System.out.println("--------------------------------------");
		String st20=new String("aaaa");
		String st30=new String("aaab");
		
		System.out.println(st20.equals(st30));
		System.out.println(st20.compareTo(st30));
		//System.out.println(st10);
		System.out.println("--------------------------------------");
		String st40="               abcd     efg             ";
		System.out.println(st40.trim());
		String st50="java#web#spring";
		String[] sts=st50.split("#");
		System.out.println(sts[0]);
		System.out.println(sts[1]);
		System.out.println(sts[2]);
	}

}





















