package com.bit.day20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Ex13 {

	public static void main(String[] args) {
		// ObjectStream

		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("test13.bin");
			oos=new ObjectOutputStream(fos);
			
			Vector vec = new Vector();
			vec.add(1234);
			vec.add(3.14);
			vec.add(false);
			vec.add('A');
			vec.add("Àß µé¾î°¬³ª?");
			
			oos.writeObject(vec);
			oos.writeInt(4321);
			oos.writeDouble(0.14);
			
			Vector vec2=new Vector();
			vec2.add(1111);
			vec2.add("abcdefg");
			
			oos.writeObject(vec2);
			
			Vector vec3=new Vector();
			vec3.add(vec);
			vec3.add(vec2);
			
			oos.writeObject(vec3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
















