class Ex40{


	public static void main(String[] args){

		myFunc01();
		
		Ex40 me = new Ex40();// 객체 생성을 통해 참조변수만들고
		me.myFunc02();// 참조변수를 통해 메서드 접근
		int result = me.myFunc03();
		System.out.println("result="+result);
		me.myFunc04("Hello World");
		//me.myFunc01(); // 실행은 가능하나 문법적으로 틀림

	}// main end


	public static void myFunc01(){
		System.out.println("static 메서드 myFunc01()");
	}

	public void myFunc02(){
		System.out.println("non-static 메서드 myFunc02()");
	}
	
	public int myFunc03(){
		return 1234;
	}
	
	public void myFunc04(String msg){
		System.out.println(msg);
	}
} // class end











