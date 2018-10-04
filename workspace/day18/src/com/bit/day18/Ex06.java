package com.bit.day18;

/*
 * 5-6
 * 내부클래스
 * static클래스
 * 멤버클래스(non-static내부클래스)
 * 로컬클래스
 * 
*/
class Lec06{
	static int su1=1111;
	int su2=2222;
	
	static void func01(){
		class Local{
			int su3=3333;
//			static int su4=4444;
			final static int su4=4444;

			public Local() {
				System.out.println("static func01-Local()");
			}
			
			public void func03(){
				System.out.println("Local-func03");
			}
		}
		
		new Local().func03();
	}
	
	// ~1.7
	// 1.8~
	void func02(final int a){
//		final int a=10;
		
		class Local{
			int su3=3333;
//			static int su4=4444;
			final static int su4=4444;
			
			public Local() {
				System.out.println("func02-Local()");
			}
			public void func03(){
				System.out.println("Local-func03");
			}
			public void func04(){
				System.out.println(a);
			}
		}
//		Local local=new Local();
//		local.func03();
		new Local().func04();
		return;
	}
}




public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Lec06.func01();
		Lec06 you=new Lec06();
		you.func02(10);
		you.func02(100);
	}

}


















