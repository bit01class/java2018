package com.bit.day21.thr;

public class Ex03 {

	public static void main(String[] args) {
		Runnable work=new Runnable() {
			
			@Override
			public void run() {
				// 스레드를 통해 하고 싶은 일
				String name=Thread.currentThread().getName();
				System.out.println(name+"스레드 시작");
				System.out.println(name+"스레드 종료");
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
				System.out.println(name+"스레드");
			}
		});
		thr1.start();
		
		thr1=new Thread(){
			@Override
			public void run() {
				System.out.println("하고싶은일");
			}
		};
		thr1.start();
	}

}






















