package com.bit.day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex16 {

	public static void main(String[] args) throws IOException {
		InputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("test15.bin");
			ois=new ObjectInputStream(fis);
			
			String ele1=(String)ois.readObject();
			System.out.println(ele1);
			
			ArrayList ele2=(ArrayList) ois.readObject();
			System.out.println(Arrays.toString(ele2.toArray()));
			
			HashSet ele3= (HashSet) ois.readObject();
			Iterator ite = ele3.iterator();
			while(ite.hasNext()){
				System.out.println(ite.next());
			}
			HashMap ele4= (HashMap) ois.readObject();
			Set keys = ele4.keySet();
			Iterator ite2 = keys.iterator();
			while(ite2.hasNext()){
				String key=(String) ite2.next();
				System.out.println(key+":"+ele4.get(key));
			}
			char[] ele5=(char[]) ois.readObject();
			System.out.println(Arrays.toString(ele5));
			
			MyClass ele6=(MyClass) ois.readObject();
			System.out.println(ele6.su);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			fis.close();
		}
		
	}

}





















