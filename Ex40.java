class Ex40{


	public static void main(String[] args){

		myFunc01();
		
		Ex40 me = new Ex40();// ��ü ������ ���� �������������
		me.myFunc02();// ���������� ���� �޼��� ����
		int result = me.myFunc03();
		System.out.println("result="+result);
		me.myFunc04("Hello World");
		//me.myFunc01(); // ������ �����ϳ� ���������� Ʋ��

	}// main end


	public static void myFunc01(){
		System.out.println("static �޼��� myFunc01()");
	}

	public void myFunc02(){
		System.out.println("non-static �޼��� myFunc02()");
	}
	
	public int myFunc03(){
		return 1234;
	}
	
	public void myFunc04(String msg){
		System.out.println(msg);
	}
} // class end











