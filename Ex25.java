class Ex25{

public static void main(String[] args){
// Q1. 1~10������ ���� ���Ͻÿ�
	int sum1=0;
	for(int a=1; a<=10; a++){
		System.out.print(a+",");
		System.out.println(sum1);
		sum1+=a;// sum1=sum1+a;
	}
	System.out.println("1~10���� ������ "+sum1);

// Q2. 1~10������ ¦������ ���� ���Ͻÿ�
	int sum2;
	sum2=0;
	/*
	for(int b=2; b<=10; b+=2){
		System.out.println(b);
		sum2+=b;
	}
	System.out.println("1~10���� ¦������ ���� "+sum2);
	

	for(int b=1; b<=10; b++){
		if(b%2==0){
			sum2+=b;
		}
	}
	System.out.println("1~10������ ¦������ "+sum2);
	*/

	for(int b=1; b<=10; b++){
		b++;
		sum2+=b;
	}
	System.out.println("1~10������ ¦������ "+sum2);

// Q3. 1+3+5+7+9+11+...49=25�� ����Ͻÿ�
	int sum3=0;
	for(int c=1; c<50; c+=2){
		if(c!=1){
			System.out.print("+");
		}
		System.out.print(c);
		sum3+=c;
	}
	System.out.println("="+sum3);
// Q4. 1~50���� �� 3�� ����� ����Ͻÿ�
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
// Q5. 2�� 1��, 2�� 2��, 2�� 3��, 2�� 4��, 2�� 5���� ���Ͻÿ�
//	2 4 8 16 32
//	1*2 1*2*2 1*2*2*2 1*2*2*2*2 1*2*2*2*2*2
	int sum5=1;
	for(int e=1; e<=5; e++){
		sum5*=2;
		System.out.print(sum5+" ");
	}



}

}











