class Ex41{
	/*
		static �� non-static ( [ ]�� �������� )
	static -> static = [Ŭ������].ȣ��(); 
	static -> non-static = ��ü���� �� ��������.ȣ��();
	non-static -> static = [Ŭ������].ȣ��();
	non-static -> non-static = ȣ��();
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














