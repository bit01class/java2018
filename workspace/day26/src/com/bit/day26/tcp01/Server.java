package com.bit.day26.tcp01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket server=null;
		Socket sock=null;
		InputStream in=null;
		DataInputStream dis=null;
		try {
			server=new ServerSocket(8080);
			sock=server.accept();
			in=sock.getInputStream();
			dis=new DataInputStream(in);
			
			System.out.println(10000+dis.readInt());
			System.out.println(!dis.readBoolean());
			System.out.println(dis.readDouble());
			System.out.println("¸Þ½ÃÁö:"+dis.readUTF());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
