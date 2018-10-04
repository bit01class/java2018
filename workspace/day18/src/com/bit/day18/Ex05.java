package com.bit.day18;



class Outter{
	static int su1=1111;
	int su2=2222;
	
	class Inner{
		int su3=3333;
		final static int su4=4444;
//		static int su5=5555; ¾ÈµÊ
		
		
		public Inner() {
		}
		
		public void func03(){
			System.out.println("Inner-func03()");
//			Outter.func01();
//			Outter outt=new Outter();
//			outt.func02();
//			func02();
//			Inner me= new Inner();
//			me.func04();
//			this.func04();
		}
		public void func04(){}
//		public static void func04(){¾ÈµÊ
//		}
	}
	
	public Outter() {
	}
	
	public static void func01(){
		System.out.println("Outter-func01()");
	
		Outter outt=new Outter();
		Inner inn=outt.new Inner();
		inn.func03();
	}
	
	public void func02(){
		System.out.println("Outter-func02()");
//		Inner inn=new Inner();
//		inn.func03();
	}
	
}


public class Ex05 {

	public static void main(String[] args) {
		Outter outt=new Outter();
		Outter.Inner inn = outt.new Inner();
		inn.func03();
		System.out.println(inn.su3);
	}

}



















