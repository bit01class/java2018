package com.bit.day18;

abstract class Lec88{
	public void func01(){
		System.out.println("������ �޼���");
	}
	public abstract void func02();
}

public class Ex08 {
	
	interface Lec08{
		public void func();
	}
	
	
	Lec08 me=new Lec08(){
		
		@Override
		public void func() {
			System.out.println("���");
		}
	};

	public static void main(String[] args) {
		// �͸�Ŭ����
//		Ex08 you=new Ex08(); 
//		you.me.func();
		
		Lec88 ex1=new Lec88(){
			@Override
			public void func02() {
				System.out.println("���� ������");
			}
		};
		
		ex1.func01();
		ex1.func02();
		
		Ex08 ex2=new Ex08(){
			@Override
			public void func4() {
				super.func4();
				System.out.println("�͸�Ŭ�������� ��������");
			}
		};
		ex2.func4();
		
		
//		Lec08 me=()->{System.out.println("���ٽ����� ���");};
//		me.func();
	}
	
	public void func4(){
		System.out.println("�����");
	}

}















