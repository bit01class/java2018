class Ex41{
	/*
		static 과 non-static ( [ ]는 생략가능 )
	static -> static = [클래스명].호출(); 
	static -> non-static = 객체생성 후 참조변수.호출();
	non-static -> static = [클래스명].호출();
	non-static -> non-static = 호출();
	*/


	public static void main(String[] args){

		//myFunc01();
		//Ex40 you = new Ex40();
		//you.myFunc02();

		Ex41 me = new Ex41();
		me.myFunc02();
	}//main end

	public static void myFunc01(){
		System.out.println("Ex41-myFunc01()");
	}

	public void myFunc02(){
		System.out.println("Ex41-non-myFunc02()");
		myFunc03();
	}

	public void myFunc03(){
		System.out.println("Ex41-non-myFunc03()");
		myFunc01();
	}

}//class end














