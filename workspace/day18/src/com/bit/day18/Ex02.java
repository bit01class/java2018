package com.bit.day18;

class Lec02{
	int su;
	
//	public Lec02(int su) {
//		this.su=su;
//	}
	
	@Override
	public int hashCode() {
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		return this.su==((Lec02)obj).su;
	}
	
//	@Override
//	public String toString() {
//		
//		return "¹Ù²Þ";
//	}
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Lec02 lec1 =new Lec02(100);
//		Lec02 lec2 =new Lec02(101);
//		System.out.println(lec1);
//		System.out.println(lec2);
//		System.out.println(lec1==lec2);
//		System.out.println(lec1.equals(lec2));
//		Class clz = lec1.getClass();
//		System.out.println(clz.getName());
//		System.out.println(clz.getCanonicalName());
//		Object obj=new Object();
//		Class clz2 = obj.getClass();
//		System.out.println(clz2.getName());
//		System.out.println(clz2.getCanonicalName());
		
//		Lec02 lec3=new Lec02();
//		System.out.println(lec3.getClass().getName());
//		Class clz = lec3.getClass();
		try {
			Class clz = Class.forName("com.bit.day18.Lec02");
			Object obj2 = clz.newInstance();
			System.out.println(obj2);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}





















