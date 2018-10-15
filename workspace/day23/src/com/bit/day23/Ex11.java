package com.bit.day23;

public class Ex11 implements Runnable{
	int sum=0;

	@Override
	public void run() {
		for(int i=0; i<1000; i++){
			func(i);
		}
	}
	
	public void func(int i){
		//~~~~
		synchronized(this){
			int hab=sum+i;
			sum=hab;
		}
		//~~~~
		
	}
	
	public static void main(String[] args) {
		Ex11 me =new Ex11();
		
		Thread thr1=new Thread(me);
		Thread thr2=new Thread(me);
		thr1.start();
		thr2.start();
		
		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sum:"+me.sum);
	}

}














