package com.bit.day23;

public class Ex04 extends Thread {
	static int tot;
	int su1;
	int su2;
	
	public Ex04(int a, int b) {
		su1=a;
		su2=b;
	}
	
	@Override
	public void run() {
		for(int i=su1; i<=su2; i++){
//			tot+=i;
			func(i);
		}
	}
	
	public synchronized void func(int a){ // synchronized 메소드의 동기화
		int sum=tot+a;
		tot=sum;		
	}

	public static void main(String[] args) {
		// 동기화
		// 1~500
		// 501~1000;
		// 500500;
		Ex04 before1=new Ex04(1,250);
		Ex04 before2=new Ex04(251,500);
		Ex04 after1=new Ex04(501,750);
		Ex04 after2=new Ex04(751,1000);
		
		before1.start();
		before2.start();
		after1.start();
		after2.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("tot:"+tot);
	}

}



















