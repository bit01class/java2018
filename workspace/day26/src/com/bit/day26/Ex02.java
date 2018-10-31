package com.bit.day26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		byte[] buf=new byte[512];
		
		DatagramSocket ds=null;
		DatagramPacket dp=null;
		try {
			ds=new DatagramSocket(8080);
			dp=new DatagramPacket(buf, 3);
			ds.receive(dp);
			byte[] data=dp.getData();
			System.out.println(Arrays.toString(data));
			System.out.println(new String(data));
			
			dp=new DatagramPacket(buf, 3);
			ds.receive(dp);
			data=dp.getData();
			System.out.println(Arrays.toString(data));
			System.out.println(new String(data));
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}












