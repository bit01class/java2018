class Ex15{

public static void main(String[] args){
	//연산자
	// 우선순위 1>5
	//1. 증감 연산자(++,--)
	int a=5;
	++a;//6
	a++;//6 다음에 a가 등장하면 7
	//2. 산술 연산자
	// 사칙연산(+ - * / %)

	//3. 비교 연산자(결과: boolean)
	// <, >, <= , >=, ==(동등비교연산자), !=
	boolean result;
	result=a!=6;
	System.out.println(result);
	//4. 논리 연산자(a b = boolean)
	// && (and)
	// || (or)
	// ! (not)
	boolean x=true;
	boolean y=true;

	System.out.println(x+"&&"+y+"="+(x&&y));	
	System.out.println(x+"||"+y+"="+(x||y));
	x=false;
	y=false;
	System.out.println(x+"&&"+y+"="+(x&&y));	
	System.out.println(x+"||"+y+"="+(x||y));
	x=true;
	y=false;
	System.out.println(x+"&&"+y+"="+(x&&y));	
	System.out.println(x+"||"+y+"="+(x||y));
	System.out.println("------------------------------");
	System.out.println(!true);
	System.out.println(!false);
	//5. 대입 연산자(=,+=,-=,*=,/=)
	a=2;
	a*=2+10;// a=a*(2+10);
	System.out.println(a);

}

}











