package com.bit.day11;

class Total{
	int su;
	
	public Total(int su) {
		this.su=su;
	}
	
	Total plus(int a){
		su+=a;
		return this;
	}
	
	@Override
	public String toString(){
		return ""+su;
	}
}

public class Ex07 {

	public static void main(String[] args) {
		Total tot=new Total(100);
		Total tot2=tot.plus(10).plus(20).plus(30).plus(40);
		System.out.println(tot);
	}

}

















