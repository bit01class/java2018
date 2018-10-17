package com.bit.day25.cs03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
	Socket sock;
	
	@Override
	public void run() {
		InputStream in=null;
		OutputStream out=null;
		
		PrintStream ps=null;
		BufferedReader br=null;
		try {
			InetAddress addr = sock.getInetAddress();
			in=sock.getInputStream();
			out=sock.getOutputStream();
			
			br=new BufferedReader(new InputStreamReader(in));
			ps=new PrintStream(out);
			
			while(true){
				String msg=br.readLine();
				ps.println(addr.getHostName()+">"+msg);
			}
		} catch (IOException e) {
			try {
				sock.close();
			} catch (IOException ee) {
				e.printStackTrace();
			}
		} finally{
			try {
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ServerSocket server=null;
		
		try {
			server=new ServerSocket(8080);
			while(true){
				Server thr=new Server();
				thr.sock = server.accept();
				String guest=thr.sock.getInetAddress().getHostName();
				System.out.println("ip:"+guest+"´Ô Á¢¼ÓÇÔ");
				thr.start();
			}
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
