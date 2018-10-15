package com.bit.day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Ex14 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("test13.bin");
			ois=new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			Vector vec = (Vector) obj;
			Enumeration eles = vec.elements();
			while(eles.hasMoreElements()){
				System.out.println(eles.nextElement());
			}
			int su=ois.readInt();
			double su2=ois.readDouble();
			System.out.println(su);
			System.out.println(su2);
			
			Vector vec2 = (Vector)ois.readObject();
			for(int i=0; i<vec2.size(); i++){
				System.out.println(vec2.elementAt(i));
			}
			
			Vector vec3=(Vector)ois.readObject();
			Vector vec4=(Vector) vec3.get(0);
			Vector vec5=(Vector) vec3.get(1);
			
			for(int i=0; i<vec4.size(); i++){
				System.out.println(vec4.get(i));
			}
			for(int i=0; i<vec5.size(); i++){
				System.out.println(vec5.get(i));
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}


















