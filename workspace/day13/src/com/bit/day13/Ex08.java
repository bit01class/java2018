package com.bit.day13;

class 자동차{
	
	int 속도;
	String 색깔;
	
	void 앞으로달린다(){
		
	}
	
	void 멈춘다(){
		
	}
	
}

class 기아자동차 extends 자동차{
	String 제조사;
	String 출시일;
	
	void 뒤로간다(){
		
	}
}

class 레이 extends 기아자동차{
	int 최대속도;
	double 연비;
	String 모델명;
	
	void 화물적재한다(){
		
	}
	
}


public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		레이 mycar = new 레이();
		mycar.화물적재한다();
		mycar.뒤로간다();
		mycar.앞으로달린다();
		mycar.멈춘다();
	}

}
