package com.bit.day23;

public class Ex07 extends Thread {
	int dan;
	boolean last1=true;
	boolean last2=false;
	boolean last3=true;

	public Ex07(int su) {
		dan=su;
	}
	
	@Override
	public void run() {
		if(!last2&&dan==4){
			yield();// running 상태의 현 스레드를 runnable상태로 ...
		}
		for(int i=1; i<10; i++){
			System.out.println(dan+"x"+i+"="+dan*i);
		}
		if(last1&&last3){
			last2=true;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex07 thr1 =new Ex07(2);// 2단
		Ex07 thr2 =new Ex07(4);// 4단
		Ex07 thr3 =new Ex07(6);// 6단
		
		thr1.start();
		thr2.start();
		thr3.start();
	}

}
