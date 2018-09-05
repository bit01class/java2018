class Ex31{

public static void main(String[] args){
	/*
	 Q1. A B C D E F G...Z 출력
	*/
	int limit='Z'-'A'+1;
	for(int i=0; i<limit; i++){
		System.out.print((char)('A'+i)+" ");
	}
	System.out.println();
	System.out.println("------------while------------");
	char ch='A';
	int cnt=0;
	while(true){
		
		System.out.print(ch);
		if(ch=='Z'){
			break;
		}
		ch=(char)(ch+1);
		cnt++;
	}
	System.out.println();
	System.out.println("----------------------------");
	/*
	 Q2.	☆ ☆ ☆
		☆ ☆ ☆
		☆ ☆ ☆
	*/
	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			System.out.print("☆ ");
		}
		System.out.println();
	}

	System.out.println("----------------------------");
	int a,b;
	a=0;
	while(a<3){
		b=0;
		while(b<3){
			System.out.print("☆ ");
			b++;
		}
		System.out.println();
		a++;
	}
	System.out.println("----------------------------");
	/*
	 Q3.	1 2 3		0+1 0+2 0+3	3*0+1 3*0+2 3*0+3
		4 5 6		3+1 3+2 3+3	3*1+1 3*1+2 3*1+3
		7 8 9		6+1 6+2 6+3	3*2+1 3*2+2 3*2+3
	
	for(int j=0; j<7; j+=3){
		for(int i=1; i<4; i++){
			System.out.print(j+i+" ");
		}
		System.out.println();
	}
	*/
	// 입력 받기 준비
	//java.util.Scanner scan = new java.util.Scanner(System.in);
	System.out.print("가로세로 크기>");
	int limit3=3;// 입력받기
	for(int i=0; i<limit3; i++){
		for(int j=1; j<=limit3; j++){
			System.out.print(limit3*i+j+"\t");
		}
		System.out.println();
	}
	

	System.out.println("----------------------------");

	
	a=0;
	while(a<3){
		b=0;
		while(b<3){
			System.out.print((char)('A'+3*a+b));
			b++;
		}
		System.out.println();
		a++;
	}
	System.out.println("----------------------------");
	/*
	 Q4. 	a b c		a+0	a+1	a+2
		d e f		a+3	a+4	a+5
		g h i		a+6	a+7	a+8

	*/	
	
	int limit4=4;
	for(int j=0; j<limit4; j++){
		for(int i=0; i<limit4; i++){
			System.out.print((char)('a'+limit4*j+i)+"\t");
		}
		System.out.println();
	}
	
	System.out.println("----------------------------");
	for(int i=0; i<9; i++){
		if(i%3==0){
			System.out.println();
		}
		System.out.print((char)('A'+i)+" ");

	}
	System.out.println("\n----------------------------");
}

}











