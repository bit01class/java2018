package com.bit.day36;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Server01 {

	public static void main(String[] args) {
		// 
		String msg ="";
		ServerSocket serve=null;
		OutputStream out=null;
		DataOutputStream dos=null;
		try {
			serve=new ServerSocket(80);
			System.out.println("접속대기 중....");
			Socket sock = serve.accept();
			System.out.println(sock.toString());
			
			File file= new File("./www/main.html");
			
			InputStream is = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			msg+=br.readLine();
			
			out=sock.getOutputStream();
			dos=new DataOutputStream(out);
			
			dos.writeBytes("HTTP/1.1 200 OK \r\n");
//			dos.writeBytes("Content-Type:text/plain;charset=utf-8\r\n");
			dos.writeBytes("Content-Type:text/html;charset=utf-8\r\n");
//			dos.writeBytes("Content-Length:"+msg.length()+"\r\n");
			dos.writeBytes("Content-Length:"+file.length()+"\r\n");
			dos.writeBytes("\r\n");
			dos.writeBytes(msg);
			
			
			sock.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			System.out.println("접속종료");
			try {
				serve.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
