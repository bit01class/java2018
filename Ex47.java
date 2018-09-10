class Ex47{
/*
자바는 클래스구성
 클래스 구성
	1. 메서드
	2. 변수(클래스변수, 맴버필드)
	  주의 1. 변수의 선언과 초기화가 동시에 되어야만 함
	  주의 2. 선언만 있을 경우, 디폴트 값을 갖음
*/
public static int a=54321;// 클래스변수 - 전역변수, static변수
public int b=12345; // 맴버필드 -non-static 변수
public static c;

public static void main(String[] args){

	int val1=func01();
	System.out.println(val1);

	Ex47 ex47 = new Ex47();
	int val2=ex47.func02();
	System.out.println(val2);
} // main end

public static int func01(){
	System.out.println("static 메서드");
	return 1234;
} // func01 end


public int func02(){
	System.out.println("non-static 메서드");
	return 4321;
}


}