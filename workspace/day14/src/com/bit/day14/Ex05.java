package com.bit.day14;
//���

import com.bit.day14.pm.Lec01;
import java.util.Scanner;

class Lec05 extends Object{
	int su=1111;
	
	Lec05() {
	}
	
	void func01(){
		System.out.println("�θ��� ���1");
	}
}
// public > protected >= default > private 
// private����Ǵ��x
public class Ex05 extends Lec01 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ex05 me=new Ex05();
		me.func01();
//		System.out.println(me.su);
		
//		com.bit.day14.pm.Lec01 lec=new com.bit.day14.pm.Lec01();
//		lec.func01();
//		lec.su=2222;
	}

}

























