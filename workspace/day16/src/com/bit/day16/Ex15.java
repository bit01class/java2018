package com.bit.day16;

class Lec15<T extends Number>{
//class Lec15<T super Integer>{
	T su;
	
	public void set(T a){
		su=a;
	}
	
	public T get(){
		return su;
	}
	
}

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec15<Integer> me = new Lec15<Integer>();
		Lec15<Double> you = new Lec15<Double>();
		Lec15<Number> you2 = new Lec15<Number>();
//		Lec15<Object> you3 = new Lec15<Object>();
	}

}














