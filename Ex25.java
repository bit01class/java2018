class Ex25{

public static void main(String[] args){
// Q1. 1~10까지의 합을 구하시오
	int sum1=0;
	for(int a=1; a<=10; a++){
		System.out.print(a+",");
		System.out.println(sum1);
		sum1+=a;// sum1=sum1+a;
	}
	System.out.println("1~10까지 총합은 "+sum1);

// Q2. 1~10까지의 짝수들의 합을 구하시오
	int sum2;
	sum2=0;
	/*
	for(int b=2; b<=10; b+=2){
		System.out.println(b);
		sum2+=b;
	}
	System.out.println("1~10까지 짝수들의 합은 "+sum2);
	

	for(int b=1; b<=10; b++){
		if(b%2==0){
			sum2+=b;
		}
	}
	System.out.println("1~10까지의 짝수합은 "+sum2);
	*/

	for(int b=1; b<=10; b++){
		b++;
		sum2+=b;
	}
	System.out.println("1~10까지의 짝수합은 "+sum2);

// Q3. 1+3+5+7+9+11+...49=25를 출력하시오
	int sum3=0;
	for(int c=1; c<50; c+=2){
		if(c!=1){
			System.out.print("+");
		}
		System.out.print(c);
		sum3+=c;
	}
	System.out.println("="+sum3);
// Q4. 1~50까지 중 3의 배수를 출력하시오
	//+2, +3, +3, +3
	/*
	for(int d=1; d<=50; d++){
		if(d%3==0){
			System.out.print(d+" ");
		}
	}
	*/
	for(int d=1; d<=47; d++){
		d+=2;
		System.out.print(d+" ");
	}
	
	System.out.println();
// Q5. 2의 1승, 2의 2승, 2의 3승, 2의 4승, 2의 5승을 구하시오
//	2 4 8 16 32
//	1*2 1*2*2 1*2*2*2 1*2*2*2*2 1*2*2*2*2*2
	int sum5=1;
	for(int e=1; e<=5; e++){
		sum5*=2;
		System.out.print(sum5+" ");
	}



}

}











