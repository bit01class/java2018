package com.bit.day25.cs01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

public class Server {

	public static void main(String[] args) {
		ServerSocket server=null;
		Socket sock=null;
		OutputStream out=null;
		InputStream in=null;
		try {
			server=new ServerSocket(8080);
			sock = server.accept();
			in=sock.getInputStream();
			out=sock.getOutputStream();
			
			while (true) {
				int su=in.read();
				if(su=='\r'){break;}
				System.out.println(su);
				out.write((byte)su);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			
			try {
				in.close();
				out.close();
				sock.close();
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
