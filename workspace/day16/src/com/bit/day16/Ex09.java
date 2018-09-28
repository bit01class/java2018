package com.bit.day16;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Ball implements Comparable{
	int num;
	String color;
	
	public Ball(int num) {
		this.num=num;
		if(num<10){
			color="노랑색";
		}else if(num<20){
			color="빨강색";
		}else if(num<30){
			color="파랑색";
		}else if(num<40){
			color="초록색";
		}else{
			color="검은색";
		}
	}

	@Override
	public int compareTo(Object obj) {
		Ball target=(Ball) obj;
//		return target.num-this.num;// 내림차순
		return this.num-target.num;// 오름차순
		
	}
	
}

public class Ex09 {

	public static void main(String[] args) {
		// lotto번호 생성기
		Set box = new TreeSet();
		
		while(box.size()<6){
			int ran=(int)(Math.random()*45)+1;
			Ball ball=new Ball(ran);
			box.add(ball);
		}
		
		System.out.println("로또 번호는");
		Iterator ite = box.iterator();
		while(ite.hasNext()){
			Ball ball=(Ball) ite.next();
			System.out.println(ball.color+"공 "+ball.num+"번");
		}
		System.out.println("입니다 축하드립니다");
	}

}

















