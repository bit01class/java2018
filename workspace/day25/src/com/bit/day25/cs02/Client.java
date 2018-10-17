package com.bit.day25.cs02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socket sock=null;
		OutputStream out=null;
		InputStream in=null;
		
		OutputStreamWriter osw=null;
		InputStreamReader isr=null;
		
		BufferedReader br=null;
		PrintWriter pw=null;
		
		try {
			sock=new Socket("localhost",8080);
			out=sock.getOutputStream();
			in=sock.getInputStream();
			
			osw=new OutputStreamWriter(out);
			isr=new InputStreamReader(in);
			
			br=new BufferedReader(isr);
			pw=new PrintWriter(osw);
			
			while(true){
				System.out.print(">");
				String msg=sc.nextLine();
				pw.println(msg);
				pw.flush();
				if(msg.equals("exit")){break;}
				System.out.println(br.readLine());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
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

}
