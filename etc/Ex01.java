/*
컴파일언어 - 소스, 실행 별도
인터프리터 언어 - 소스&실행

JDK
JRE


*/

class Ex01{

	/*
		구성요소 
		1. 메서드
			- static , non-static

	*/ 
	public static void main(String[] aaaa){
		System.out.println("test....");
		int a=-100;
		a=a--;
		System.out.println(a+1);
	

		// break;
		//continue;

		for(int i=0; i<3; i++){if(i==1){break;}
			for(int j=0; j<3; j++){
				
				System.out.println("i="+i+",j="+j);
			}
		}	
	}

}














