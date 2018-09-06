class Ex39{

	public static void main(String[] args){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("계산기(ver 0.0.1)");
		System.out.println("-----------------------");

		System.out.print("첫번째 수>");
		int input1=scan.nextInt();
		System.out.print("두번째 수>");
		int input2=scan.nextInt();

		System.out.print("1.더하기 2.빼기 3.곱하기 4.나누기>");
		int input3=scan.nextInt();
		int result=0;
		String mark="";
		switch(input3){
			case 1:
				mark="+";
				result=Ex38.plus(input1,input2);
				break;
			case 2:
				mark="-";
				result=Ex38.minus(input1,input2);
				break;
			case 3: 
				mark="x";
				result=multi(input1,input2);
				break;
			case 4:
				mark="÷";
				result=multi(input1,input2);
				break;
		}
		System.out.println(input1+mark+input2+"="+result);		
	}//main end

	public static int multi(int a, int b){
		int gob=a*b;
		return gob;
	}// multi end

	public static int div(int a, int b){
		int nanum=a/b;
		return nanum;
	}// div end

} // class end














