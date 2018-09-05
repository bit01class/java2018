class Ex05{

	public static void main(String[] args){

		// 변수
		// x*y=z

		// 정수형(4byte)-2^31 ~ 2^31-1 (-2147483648 ~ 2147483647)
		int x; // 변수의 선언
		x=100; // 변수의 초기화
		System.out.println(x-10);
		System.out.println("---------------------");
		// 실수형0x0.0000000000001P-1022 ~ 0x1.fffffffffffffP+1023
		double y;
		y=3.14;
		System.out.println(y-3);
		System.out.println("---------------------");
		// 문자형(2byte)  u0000 ~  uffff (0 ~ 2^15-1)
		char a;
		a='a';
		System.out.println(a);
		System.out.println("-----------------------");
		// 불린형(1bit)     true, false
		boolean b;
		b=true;
		System.out.println(b);
		System.out.println("-----------------------");
		// 문자열
		String c;
		c="문자열 입니다";
		System.out.println(c);
	}



}









