package com.bit.day16;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Car{
	@Override
	public int hashCode() {
		return 1234;
	}
	@Override
	public boolean equals(Object obj) {
		return this.toString().equals(((Car)obj).toString());
	}
}

public class Ex07 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		Set set = new HashSet();
		
		System.out.print("1입력>");
		set.add(new Car());
		System.out.print("2입력>");
		set.add(new Car());
		System.out.print("3입력>");
		set.add(new Car());
		
		System.out.println("size:"+set.size());
	}

}
