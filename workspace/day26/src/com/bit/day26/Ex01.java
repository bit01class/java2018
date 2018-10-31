package com.bit.day26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Ex01 {

	public static void main(String[] args) {
		// UDP
		// server
		byte[] buf=new byte[512];
		String msg="Hello!";
		int port=8080;
		String ip="localhost";
		
		InetAddress addr=null;
		
		DatagramSocket ds=null;
		DatagramPacket dp=null;
		try {
			addr=InetAddress.getByName(ip);
			ds=new DatagramSocket();
			buf = msg.getBytes();
			
			dp=new DatagramPacket(buf,buf.length,addr,port);
			ds.send(dp);
			buf="ÀÚ¹Ù".getBytes();
			dp=new DatagramPacket(buf,buf.length,addr,port);
			ds.send(dp);
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			ds.close();
		}

	}

}






















