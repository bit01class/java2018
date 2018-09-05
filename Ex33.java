class Ex33{

	public static void main(String[] args){
		myFunc1(2,3);
		int result=myFunc2(2,2);
		if(result%2==0){
			return;
		}
		System.out.println("°á°ú´Â "+result);
		
	}// main end

	public static void myFunc1(int a, int b){
		System.out.println(a+"+"+b+"="+(a+b));
		return;
	}

	public static int myFunc2(int a, int b){
		int c= a+b;
		return c;
	}

}// class end