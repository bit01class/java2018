package com.bit.day14;

abstract class Lec10{
	// �߻�Ŭ���� - �߻�޼��带 0�� �̻� ���� Ŭ����
	// Ŭ���� ���� �տ� abstract Ű���尡 ������ �߻�Ŭ����
	int su;
	
	public Lec10() {
	}
	
	public void func01(){
		System.out.println("Lec10-func01()");
	}
	
	public abstract void func02();// �߻�޼��� (abstract)
}


public class Ex10 extends Lec10 {
	
	@Override
	public void func02(){
		System.out.println("���� �������̵��� func02()");
	}

	public static void main(String[] args) {
		// �߻�Ŭ����
		Ex10 me = new Ex10();
		me.func01();
		me.func02();
		
		Lec10 you=new Ex10();
		you.func01();
		you.func02();
	}

}














