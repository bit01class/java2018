package com.bit.day23;

public class Ex09 extends Thread{
	
	@Override
	public void run() {
		int su=0;
		int su2=10;
		while(true){
			su++;
			if(su==su2){
				System.out.println("����");
				su2*=10;
				}
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Ex09 me =new Ex09();
		me.start();
		
		sleep(2000);
		
		me.suspend();// �Ͻ�����
		
		sleep(2000);
		me.resume();// �����Ȱ��� ���
		
		sleep(2000);
		me.stop();
	}

}














