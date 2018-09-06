class Ex38{

	public static void main(String[] args){
	
		int a=100;
		int b=20;
		
		System.out.println("a와 b의 합은 "+plus(a,b));
		System.out.println("a와 b의 차는 "+minus(a,b));	

	}// main end	

	public static int plus(int a, int b){
		System.out.println("수정됨");
		int sum=a+b;
		return sum;
	}// plus end

	public static int minus(int a, int b){
		int cha=a-b;
		return cha;
	}// minus end

} // class end