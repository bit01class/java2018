class Ex32{
	// 클래스의 구조
	// 1. 메서드


	public static void myFunc1(){

		int a;
		a=100;
		System.out.println("내가 만든 메서드 a="+a);
	
	}// myFunc1 end

	public static void main(String[] args){
		System.out.println("main 메서드 시작");
		System.out.println(1234);
		
		int a;
		a=10;
		myFunc1(); // 메서드 호출
		myFunc1(a);
		myFunc1("abcd");		
		myFunc1(2.5, 3);
		myFunc2(1234);
		System.out.println("main 메서드 종료 a="+a);
	}// main end

	public static void myFunc1(int a){
		System.out.println("a="+a);
	}

	public static void myFunc1(String msg){
		System.out.println(msg);
	}

	public static void myFunc1(double a, int b){
		System.out.println(a+"x"+b+"="+a*b);
	}

	public static void myFunc2(double a){
		System.out.println("실수 :"+a);
	}
	
	public static void myFunc2(int a){
		System.out.println("정수 :"+a);
	}
	// 메서드
	// 1. 메서드이름 첫글자 영소
	// 2. 두단어 이상의 조합에서는 두번째 단어의 첫글자 영대
	// 3. 키워드는 이름으로 불가
	// 4. 메서드 만들어놓고 호출-> 실행
	// 5. 매개변수(인자)을 받을 수도 있음, 얼마든지 받을수도 있음
	// 6. 일반적으로는 메서드 명의 중복불가
	// 	메서드 오버로드 예외) 
	//		매개변수의 유무, 자료형, 갯수

}// class end











