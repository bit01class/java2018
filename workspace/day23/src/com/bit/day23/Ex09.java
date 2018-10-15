package com.bit.day23;

public class Ex09 extends Thread{
	
	@Override
	public void run() {
		int su=0;
		int su2=10;
		while(true){
			su++;
			if(su==su2){
				System.out.println("실행");
				su2*=10;
				}
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Ex09 me =new Ex09();
		me.start();
		
		sleep(2000);
		
		me.suspend();// 일시정지
		
		sleep(2000);
		me.resume();// 중지된것을 계속
		
		sleep(2000);
		me.stop();
	}

}














