package com.bit.day14;

class Lec07{
	int su=1111;
	int su2=9999;
	
	void func01(){
		System.out.println("Lec07-func01()");
	}
}

public class Ex07 extends Lec07{
	int su=2222;
	
	@Override
	void func01(){
		System.out.println("Ex07-@Override func01()");
	}
	
	void func02(){
		System.out.println("Ex07-func02()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec07 father=new Lec07();
		father.func01();
//		father.func02();
		System.out.println(father.su);
		
		Ex07 me = new Ex07();
		me.func01();
		me.func02();
		System.out.println(me.su);
		
		Lec07 son = new Ex07();
		son.func01();
		//((Ex07)son).func02();
		System.out.println(son.su);
//		System.out.println(((Ex07)son).su);
		System.out.println(son.su2);
	}

}
















