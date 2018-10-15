package com.bit.day23;

public class Ex08 extends Thread {

	@Override
	public void run() {
		System.out.println(getName()+"������ ����");
		func01();
		System.out.println(getName()+"������ ����");
	}
	
	public synchronized void func01(){
		System.out.println(getName()+"��� ���� �ְڽ��ϴ�");
		try {
			wait();// 	blocked ����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	// p.672
	public synchronized void func02(){
		notify();	// 	blocked ���� ��, �ϳ��� runnable
		notifyAll();	// 	blocked ���� ��θ� runnable
	}
	
	public static void main(String[] args) throws InterruptedException {
		Ex08 me =new Ex08();
		Ex08 me2 =new Ex08();

		me.start();
		me2.start();
		sleep(3000);
		me.func02();
	}

}
















