package com.bit.day25.cs04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server2 implements Runnable {
	static ArrayList<Socket> list=new ArrayList<>();
	int idx;

	public static void main(String[] args) {
		ServerSocket server=null;
		Socket sock=null;
		try {
			server=new ServerSocket(8080);
			
			while(true){
				Server2 serv=new Server2();
				sock=server.accept();
				list.add(sock);
				serv.idx=list.size()-1;
				Thread thr=new Thread(serv);
				thr.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			};
		}
	}

	@Override
	public void run() {
		Socket sock = list.get(idx);
		InputStream in=null;
		BufferedReader br=null;
		try {
			in=sock.getInputStream();
			br=new BufferedReader(new InputStreamReader(in));
			
			while(true){
				String msg=br.readLine();
				for(int i=0; i<list.size(); i++){
					Socket socks = list.get(i);
					PrintStream ps = new PrintStream(socks.getOutputStream());
					ps.println(msg);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



















