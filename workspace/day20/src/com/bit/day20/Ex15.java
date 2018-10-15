package com.bit.day20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class MyClass implements Serializable{
	int su=1234;
	public void func(){
		System.out.println("내가 만든 클래스의 기능");
	}
}

public class Ex15 {

	public static void main(String[] args) throws IOException {
		OutputStream os=null;
		ObjectOutputStream oos=null;
		
		try {
			os=new FileOutputStream("test15.bin");
			oos=new ObjectOutputStream(os);
			String msg=new String("java");
			oos.writeObject(msg);
			ArrayList list = new ArrayList<>();
			list.add(1111);
			list.add(2222);
			list.add(3333);
			oos.writeObject(list);
			HashSet set = new HashSet<>();
			set.add('a');
			set.add('b');
			set.add('a');
			set.add('c');
			oos.writeObject(set);
			HashMap map = new HashMap<>();
			map.put("item1", "value1");
			map.put("item2", "value2");
			oos.writeObject(map);
			char[] chs={'A','B','C'};
			oos.writeObject(chs);
			MyClass my=new MyClass();
			oos.writeObject(my);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			oos.close();
			os.close();
		}
		

	}

}















