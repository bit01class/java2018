package com.bit.day25.cs03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socket sock=null;
		
		InputStream in=null;
		OutputStream out=null;
		
		PrintStream ps=null;
		BufferedReader br=null;
		
		try {
			sock=new Socket("10.10.10.10",8080);
			out=sock.getOutputStream();
			in=sock.getInputStream();
			
			ps=new PrintStream(out);
			br=new BufferedReader(new InputStreamReader(in));
			
			while(true){
				System.out.print('>');
				String msg=sc.nextLine();
				ps.println(msg);
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
