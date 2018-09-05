class Ex28{

public static void main(String[] args){

/*
for(초기화;조건문;증감식){
	반복코드;
}
*/
int a=0;
for(;;a++){

	System.out.println(a+1+"번 출력합니다");
	if(a==-1){
		break;
	}
}


int c=100;
System.out.println(c);


int b=100;
for(b=0; b<5; b++){
	System.out.println("b출력");
}
System.out.println("b="+b);

}

}