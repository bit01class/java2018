class Ex37{

public static void main(String[] args){
	int a, b, c;

/*
Q1.	�� �� �� ��		0,0	0,1	0,2	0,3
	�� �� �� ��		1,0	1,1	1,2	1,3
	�� �� �� ��		2,0	2,1	2,2	2,3
	�� �� �� ��	
*/
	for(int i=0; i<4; i++){
		for(int j=0; j<=i; j++){
			System.out.print("�� ");
		} // �� ���
		for(int j=0; j<3-i ; j++){
			System.out.print("�� ");
		}
		System.out.println();
	} // outter
	System.out.println("-------------------------");
/*
Q2.	�� �� �� ��
	�� �� �� ��
	�� �� �� ��
	�� �� �� ��	
*/
	for(int i=0; i<4; i++){
		for(int j=0; j<i ; j++){
			System.out.print("�� ");
		}// ��
		for(int j=0; j<4-i ; j++){
			System.out.print("�� ");
		}// ������
		System.out.println();
	} // outter
	System.out.println("-------------------------");
/*
Q3.	1 2 3 4
	1 2 3 4
	1 2 3 4
	1 2 3 4
*/
	for(int i=1; i<=20; i++){
		if(i%5==0){System.out.print('\n');
		}else{
		System.out.print(i%5+" ");
		}
	}
	System.out.println("\n-------------------------");
/*
Q4.	1 2 3 4
	2 3 4 5
	3 4 5 6
	4 5 6 7
*/
	for(int i=1; i<=20; i++){
		if(i%5==0){System.out.print('\n');
		}else{
		System.out.print(i%5+i/5+" ");
		}
	}
	
	System.out.println("\n-------------------------");
/*
Q5.	1 2 3
	4 5 6 
	7 8 9	
*/
	for(int i=1; i<=9; i++){
		System.out.print(i+" ");
		if(i%3==0){
			System.out.println();
		}
	}
	System.out.println("-------------------------");
/*
Q6.	��
	�� ��
	�� �� ��
	�� �� �� ��	
*/
	a=0;
	for(int i=0; i<4; i++){
		System.out.print("�� ");
		if(i==3){
			break;
		}else if(i==a){
			System.out.println();
			a++;
			i=-1;
		}
	}
	System.out.println("\n-------------------------");
	for(int i=0; i<4; i++){

		for(int j=0; j<4; j++){
			if(j<=i){System.out.print("�� ");}
		}
		System.out.println();
	} //outter
	System.out.println("\n-------------------------");
/*
Q7.	1
	2 2
	3 3 3
	4 4 4 4
*/
	for(int i=0; i<4; i++){

		for(int j=0; j<4; j++){
			if(j<=i){System.out.print(i+1 +" ");}
		}//inner
		System.out.println();
	} //outter	
	System.out.println("-------------------------");
/*
Q8.	1
	1 2
	1 2 3
	1 2 3 4
*/
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			if(j<=i){
				System.out.print(j+1+" ");
			}
		}//inner
		System.out.println();
	}// outter
	System.out.println("-------------------------");
/*
Q9.	1
	2 3
	4 5 6
	7 8 9 10
*/
	a=0;
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			if(j<=i){
				System.out.print(++a+" ");
			}
		}//inner
		System.out.println();
	}// outter
	

	System.out.println("-------------------------");
/*
Q10.	�� �� �� ��
	�� �� �� 
	�� �� 
	�� 	
*/
	
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			if(j<4-i){
				System.out.print("�� ");
			}
		}//inner
		System.out.println();
	}// outter

}

}