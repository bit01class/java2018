package com.bit.day15;

class stu01{// final ��ӺҰ�
	int su; // final ����� ����
	
	public void func01(){ // final �������̵�ȵ�
		System.out.println("stu01-func01()...");
	}
}

abstract class Lec01{
	int su;
	
	public Lec01() {
		// TODO Auto-generated constructor stub
	}
	
	public void func01(){
		System.out.println("�߻�Ŭ������ func01()");
		int su=func02();
		System.out.println(su+1000);
	}
	
	public abstract int func02();
	
}

public class Ex01 extends stu01{
	
	@Override
	public void func01(){
		
	}

	public static void main(String[] args) {
		// ���
//		Lec01 lec=new Lec01();
		Ex01 me = new Ex01();
		me.func01();
	}

}









