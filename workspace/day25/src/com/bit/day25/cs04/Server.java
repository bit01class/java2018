package com.bit.day25.cs04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Server extends Thread {
	Socket sock;
	static ArrayList<PrintStream> pss=new ArrayList<>();
	
	@Override
	public void run() {
		InetAddress addr = sock.getInetAddress();
		Date date =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date)+">"+addr.getHostAddress());
		
		InputStream in=null;
		BufferedReader br=null;
		
		OutputStream out=null;
		try {
			in=sock.getInputStream();
			out=sock.getOutputStream();
			br=new BufferedReader(new InputStreamReader(in));
			pss.add(new PrintStream(out));
			
			while(true){
				String msg=br.readLine();
				
				for(int i=0; i<pss.size(); i++){
					pss.get(i).println(msg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
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
				thr.sock=server.accept();
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
