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
			color="�����";
		}else if(num<20){
			color="������";
		}else if(num<30){
			color="�Ķ���";
		}else if(num<40){
			color="�ʷϻ�";
		}else{
			color="������";
		}
	}

	@Override
	public int compareTo(Object obj) {
		Ball target=(Ball) obj;
//		return target.num-this.num;// ��������
		return this.num-target.num;// ��������
		
	}
	
}

public class Ex09 {

	public static void main(String[] args) {
		// lotto��ȣ ������
		Set box = new TreeSet();
		
		while(box.size()<6){
			int ran=(int)(Math.random()*45)+1;
			Ball ball=new Ball(ran);
			box.add(ball);
		}
		
		System.out.println("�ζ� ��ȣ��");
		Iterator ite = box.iterator();
		while(ite.hasNext()){
			Ball ball=(Ball) ite.next();
			System.out.println(ball.color+"�� "+ball.num+"��");
		}
		System.out.println("�Դϴ� ���ϵ帳�ϴ�");
	}

}

















