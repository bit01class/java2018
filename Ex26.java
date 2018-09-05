class Ex26{

public static void main(String[] args){
// 제어문 - 반복문
// while문
/*
while(조건){
	수행문;
}
*/
	int n=1;
	while(n<=5){
		n++;
		System.out.println("Hello World"+n);
	}
	System.out.println("---------------------");
	int dan=9;
	System.out.println(dan+"단 출력");
	int su=1;
	while(su<10){
		System.out.println(dan+"x"+su+"="+dan*su);
		su++;
	}

	// Q1. 1~10까지의 합을 구하시오
	int sum1=0;
	int su1=1;
	while(su1<=10){
		sum1+=su1;
		System.out.println(su1);
		su1++;
	}
	System.out.println("1~10까지의 합은 "+sum1);

	// Q2. 1~10까지의 짝수들의 합을 구하시오
	int sum2=0;
	int su2=1;
	while(su2<=10){
		if(su2%2==0){
			sum2+=su2;
			System.out.println(su2);
		}
		su2++;
	}
	System.out.println("짝수합은 "+sum2);

	// Q3. 1+3+5+7+9=25를 출력하시오
	int sum3, su3;
	sum3=0;
	su3=1;
	while(su3<=10){
		if(su3%2==1){
			System.out.print(su3);
			sum3+=su3;
		}else if(su3==10){
			System.out.print("=");
		}else{
			System.out.print('+');
		}
		su3++;
	}
	System.out.println(sum3);
	// Q4. 1~50까지 중 3의 배수를 출력하시오
	int limit1=50/3;
	int su4=0;
	int sum4=0;
	while(su4<limit1){
		sum4+=3;
		System.out.println(sum4);
		su4++;
	}
	// Q5. 2의 1승, 2의 2승, 2의 3승, 2의 4승, 2의 5승을 구하시오
	int limit5=5;
	int cnt5=0;
	int su5=1;
	while(cnt5<limit5){
		su5=su5*2;
		System.out.print(su5+" ");
		cnt5++;
	}


}

}














