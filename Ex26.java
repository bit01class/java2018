class Ex26{

public static void main(String[] args){
// ��� - �ݺ���
// while��
/*
while(����){
	���๮;
}
*/
	int n=1;
	while(n<=5){
		n++;
		System.out.println("Hello World"+n);
	}
	System.out.println("---------------------");
	int dan=9;
	System.out.println(dan+"�� ���");
	int su=1;
	while(su<10){
		System.out.println(dan+"x"+su+"="+dan*su);
		su++;
	}

	// Q1. 1~10������ ���� ���Ͻÿ�
	int sum1=0;
	int su1=1;
	while(su1<=10){
		sum1+=su1;
		System.out.println(su1);
		su1++;
	}
	System.out.println("1~10������ ���� "+sum1);

	// Q2. 1~10������ ¦������ ���� ���Ͻÿ�
	int sum2=0;
	int su2=1;
	while(su2<=10){
		if(su2%2==0){
			sum2+=su2;
			System.out.println(su2);
		}
		su2++;
	}
	System.out.println("¦������ "+sum2);

	// Q3. 1+3+5+7+9=25�� ����Ͻÿ�
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
	// Q4. 1~50���� �� 3�� ����� ����Ͻÿ�
	int limit1=50/3;
	int su4=0;
	int sum4=0;
	while(su4<limit1){
		sum4+=3;
		System.out.println(sum4);
		su4++;
	}
	// Q5. 2�� 1��, 2�� 2��, 2�� 3��, 2�� 4��, 2�� 5���� ���Ͻÿ�
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














