package com.bit.day25;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex06 {
	//http://localhost:8080/
	//http://127.0.0.1:8080/
	public static void main(String[] args) {
		ServerSocket server=null;
		Socket sock=null;
		OutputStream out=null;
		try {
			server=new ServerSocket(8080);
			System.out.println("立加措扁吝....");
			sock=server.accept();
			System.out.println("立加凳");
			
			out = sock.getOutputStream();
			out.write("HTTP/1.1 200 OK \r\n".getBytes());// 己傍
			out.write("\r\n".getBytes());
			out.write("abcd".getBytes());;
			
			System.out.println("sock="+sock);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				System.out.println("立加辆丰");
				sock.close();
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
