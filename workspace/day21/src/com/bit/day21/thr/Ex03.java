package com.bit.day21.thr;

public class Ex03 {

	public static void main(String[] args) {
		Runnable work=new Runnable() {
			
			@Override
			public void run() {
				// �����带 ���� �ϰ� ���� ��
				String name=Thread.currentThread().getName();
				System.out.println(name+"������ ����");
				System.out.println(name+"������ ����");
			}
			
		};
		
		Thread thr1=new Thread(work);
		thr1.start();
		
		thr1=new Thread(work);
		thr1.start();
		
		thr1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				String name=Thread.currentThread().getName();
				System.out.println(name+"������");
			}
		});
		thr1.start();
		
		thr1=new Thread(){
			@Override
			public void run() {
				System.out.println("�ϰ������");
			}
		};
		thr1.start();
	}

}






















