package com.bit.day16;

interface Pen{
	void draw();
}

class Pencil implements Pen{
	private final int size;
	
	public Pencil(int size) {
		this.size=size;
	}
	
	public void draw(){
		System.out.println("검정색 "+size+"B 연필로 줄을 긋다");
	}
}

class Ballpen implements Pen{
	private final String color;
	
	public Ballpen(String color) {
		this.color=color;
	}
	
	public void draw(){
		System.out.println(color+"색 볼펜으로 줄을 긋다");
	}
}

class Box<T>{ // E, T, K
	T pen;
	
	public <T>Box() {
		// TODO Auto-generated constructor stub
	}
	
	public void set(T pen){
		this.pen=pen;
	}
	
	public T get(){
		return pen;
	}
	
}

public class Ex12 {

	public static void main(String[] args) {
		// java7부터 인스턴스 생성할 때 타입 인자를 2번 주지않아도됨 : 타입추론
		//- List<Integer> list = new ArrayList<Integer>(); : java6까지
		//- List<Integer> list = new ArrayList<>(); : java7부터

		Box<Pen> box1=new Box<>();
		
		Pencil pen1=new Pencil(4);
		box1.set(pen1);
		
		Pen pen= box1.get();
		pen.draw();
		
		Ballpen pen2=new Ballpen("빨강");
		box1.set(pen2);
		
		pen = box1.get();
		pen.draw();
		
		
	}

}











