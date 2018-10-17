package com.bit.day25.cs02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket server=null;
		Socket sock=null;
		InputStream in=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		OutputStream out=null;
		OutputStreamWriter osw=null;
		PrintWriter pw=null;
		
		try {
			server=new ServerSocket(8080);
			sock=server.accept();
			in=sock.getInputStream();
			out=sock.getOutputStream();
			
			isr=new InputStreamReader(in);
			br=new BufferedReader(isr);
			osw=new OutputStreamWriter(out);
			pw=new PrintWriter(osw);
			
			while(true){
				String msg=br.readLine();
				if(msg.equals("exit")){break;}
				System.out.println("server:"+msg);
				pw.println("re:"+msg);
				pw.flush();
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
