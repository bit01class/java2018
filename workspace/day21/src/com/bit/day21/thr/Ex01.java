package com.bit.day21.thr;

public class Ex01 extends java.lang.Thread {
	
	@Override
	public void run(){
		String name=getName();
		System.out.println(name+"������ ����");
		for(int i=0; i<10; i++){
			System.out.println(name+"����:"+i);
		}
		System.out.println(name+"������ ����");
	}

	public static void main(String[] args) {
		// ������
//		Ex01 me0 = new Ex01();
//		String name=me0.getName();
		Thread thr = Thread.currentThread();
		String name=thr.getName();
		
		System.out.println(name+"���� ����");
		Ex01 me = new Ex01();
		me.start();
		Ex01 me2 = new Ex01();
		me2.start();
		System.out.println(name+"���� ����");
	}
}

















