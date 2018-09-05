class Ex19{

public static void main(String[] args){
// 제어문 - 조건문(switch문)
/*
// 조건 - 값
switch(조건){
	case 값1:
		실행문;
		break;
	case 값2:
		실행문;
		break;
	...
	default :
		실행문;
		break;
}
*/
	char ch='B';
	switch(ch){
		case 'A':
		case 'a':
			System.out.println("a입니다");
			break;
		case 'B':
		case 'b':
			System.out.println("b입니다");
			break;
		case 'C':
		case 'c':
			System.out.println("c입니다");
			break;
		default :
			System.out.println("a~c가 아닙니다");
	}

}


}










