package com.bit.day10;

class Ball1{
	private int num;
	
	public Ball1(int a) {
		num=a;
	}
	public int show(){
		return num;
	}
}

public class Ex17 {

	public static void main(String[] args) {
		int su=45;
		Ball1[] balls=new Ball1[su];
		for(int i=0; i<balls.length; i++){
			balls[i]=new Ball1(i+1);
		}
		Ball1 box;
		for(int i=0; i<100000; i++){
			int ran=(int)(Math.random()*su);
			box=balls[0];
			balls[0]=balls[ran];
			balls[ran]=box;
		}
		
		for(int i=0; i<6; i++){
			System.out.println(balls[i].show());
		}
		
	}

}












