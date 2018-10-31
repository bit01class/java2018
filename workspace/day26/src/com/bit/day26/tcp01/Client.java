package com.bit.day26.tcp01;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket sock=null;
		OutputStream out=null;
		DataOutputStream dos=null;
		try {
			sock=new Socket("localhost",8080);
			out=sock.getOutputStream();
			dos=new DataOutputStream(out);
			
			dos.writeInt(1111);
			dos.writeBoolean(true);
			dos.writeDouble(3.14);
			dos.writeUTF("이러한 메시지를 보냅니다");
			dos.flush();
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







