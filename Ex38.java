class Ex38{

	public static void main(String[] args){
	
		int a=100;
		int b=20;
		
		System.out.println("a�� b�� ���� "+plus(a,b));
		System.out.println("a�� b�� ���� "+minus(a,b));	

	}// main end	

	public static int plus(int a, int b){
		System.out.println("������");
		int sum=a+b;
		return sum;
	}// plus end

	public static int minus(int a, int b){
		int cha=a-b;
		return cha;
	}// minus end

} // class end