package com.bit.day14;

abstract class Mashine{
	void on(){
		System.out.println("켰다");
	}
	void off(){
		System.out.println("끄다");
	}
	abstract void work();
}

class Tv extends Mashine{
	
	void work(){
		System.out.println("화면을 출력한다");
	}
}

class Radio extends Mashine{
	
	void work(){
		System.out.println("주파수를 잡고 방송을 들려준다");
	}
}

class Audio extends Mashine{
	void work(){
		System.out.println("음악을 들려준다");
	}
}

class Monitor extends Mashine{

	@Override
	void work() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex11 {

	public static void main(String[] args) {
		
		
		//Mashine target=new Tv();
		//Mashine target=new Radio();
		//Mashine target=new Audio();
		Mashine target=new Monitor();
		target.on();
		target.work();
		target.off();

	}

}



















