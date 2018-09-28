package com.bit.day16.temp;

interface Pen{
	void draw();
}

class Pencil implements Pen{
	private final int size;
	
	public Pencil(int size) {
		this.size=size;
	}
	
	public void draw(){
		System.out.println("������ "+size+"B ���ʷ� ���� �ߴ�");
	}
}

class Ballpen implements Pen{
	private final String color;
	
	public Ballpen(String color) {
		this.color=color;
	}
	
	public void draw(){
		System.out.println(color+"�� �������� ���� �ߴ�");
	}
}

class Box{
//	Pencil pen;
	Pen pen;
	
	public void set(Pen pen){
		this.pen=pen;
	}
	
	public Pen get(){
		return pen;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box box1=new Box();
		
		Pencil pen1=new Pencil(4);
		box1.set(pen1);
		Pen pen = box1.get();
		pen.draw();
		
		Ballpen pen2=new Ballpen("����");
		box1.set(pen2);
		pen=box1.get();
		pen.draw();
	}

}












