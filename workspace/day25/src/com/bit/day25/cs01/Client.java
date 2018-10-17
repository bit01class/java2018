package com.bit.day25.cs01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		String name="admin!";
		Socket sock=null;
		InputStream in=null;
		OutputStream out=null;
		PrintStream ps=null;
		try {
			sock=new Socket("127.0.0.1",8080);
			out=sock.getOutputStream();
			
			in=sock.getInputStream();
			ps=new PrintStream(out);
//			out.write("Hello!".getBytes());
			ps.println("Hello");
			
			while(true){
				int su=in.read();
				if(su==-1){break;}
				System.out.println((char)su);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				out.close();
				in.close();
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}














