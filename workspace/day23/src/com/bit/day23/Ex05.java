package com.bit.day23;

class Lec05{
	int su;
	
	public void printSu(){
		System.out.println(su);
	}
}

public class Ex05 extends Thread{
	Lec05 lec;

	public Ex05(Lec05 lec) {
		this.lec =lec;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			lec.su+=i;
			System.out.println(getName()+"스레드가 누적한 "+lec.su);
		}
	}
	
	public static void main(String[] args) {
		Lec05 target = new Lec05();
		
		Ex05 me1=new Ex05(target);
		Ex05 me2=new Ex05(target);
		
		me1.start();
		me2.start();
	}

}






















