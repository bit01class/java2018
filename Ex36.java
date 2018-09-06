class Ex36{

public static void main(String[] args){
	int a, b, c;

/*
Q1.	¡Ù ¡Ú ¡Ú ¡Ú		0,0	0,1	0,2	0,3
	¡Ù ¡Ù ¡Ú ¡Ú		1,0	1,1	1,2	1,3
	¡Ù ¡Ù ¡Ù ¡Ú		2,0	2,1	2,2	2,3
	¡Ù ¡Ù ¡Ù ¡Ù	
*/
	for(int i=0; i<4; i++){
	
		for(int j=0; j<4; j++){
			if(i>=j){
			System.out.print("¡Ù"+" ");
			}else{
			System.out.print("¡Ú"+" ");	
			}
		}// inner
		System.out.println();
	} //outter


	System.out.println("-------------------------");
/*
Q2.	¡Ú ¡Ú ¡Ú ¡Ú
	¡Ù ¡Ú ¡Ú ¡Ú
	¡Ù ¡Ù ¡Ú ¡Ú
	¡Ù ¡Ù ¡Ù ¡Ú	
*/
	for(int i=0; i<4; i++){
	
		for(int j=0; j<4; j++){
			if(i>j){
			System.out.print("¡Ù"+" ");
			}else{
			System.out.print("¡Ú"+" ");	
			}
		}// inner
		System.out.println();
	} //outter


	System.out.println("-------------------------");
/*
Q3.	1 2 3 4
	1 2 3 4
	1 2 3 4
	1 2 3 4
*/
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			System.out.print(1+j+" ");
		} //inner
		System.out.println();
	} //outter


	System.out.println("-------------------------");
/*
Q4.	1 2 3 4
	2 3 4 5
	3 4 5 6
	4 5 6 7
*/
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			System.out.print(1+j+i+" ");
		} //inner
		System.out.println();
	} //outter
	System.out.println("-------------------------");
/*
Q5.	1 2 3
	4 5 6 
	7 8 9	
*/
	a=0;
	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			System.out.print(++a+" ");
		} //inner
		System.out.println();
	} //outter
	System.out.println("-------------------------");
/*
Q6.	¡Ù
	¡Ù ¡Ù
	¡Ù ¡Ù ¡Ù
	¡Ù ¡Ù ¡Ù ¡Ù	
*/
	for(int i=0; i<4; i++){
		for(int j=0; j<i+1; j++){
			System.out.print("¡Ù ");
		} //inner
		System.out.println();
	} //outter
	System.out.println("-------------------------");
/*
Q7.	1
	2 2
	3 3 3
	4 4 4 4
*/
	for(int i=0; i<4; i++){

		for(int j=0; j<=i; j++){
			System.out.print(i+1+" ");
		} // inner
		System.out.println();
	} // outter
	System.out.println("-------------------------");
/*
Q8.	1
	1 2
	1 2 3
	1 2 3 4
*/
	for(int i=0; i<4; i++){

		for(int j=0; j<=i; j++){
			System.out.print(j+1+" ");
		} // inner
		System.out.println();
	} // outter

	System.out.println("-------------------------");
/*
Q9.	1
	2 3
	4 5 6
	7 8 9 10
*/
	a=0;
	for(int i=0; i<4; i++){

		for(int j=0; j<=i; j++){
			System.out.print( ++a+" ");
		} // inner
		System.out.println();
	} // outter

	System.out.println("-------------------------");
/*
Q10.	¡Ú ¡Ú ¡Ú ¡Ú3
	¡Ú ¡Ú ¡Ú 2
	¡Ú ¡Ú 1
	¡Ú 0	
*/
	for(int i=0; i<4; i++){

		for(int j=0; j<=3-i ; j++){
			System.out.print("¡Ú ");
		} // inner
		System.out.println();
	} // outter

}

}