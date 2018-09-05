class Ex23{

public static void main(String[] args){
// 입력
System.out.print("입력(1.리스트 2.입력 3.수정 0.종료) >");
java.util.Scanner scan=new java.util.Scanner(System.in);
int su=scan.nextInt();

	switch(su){
		case 1:
		System.out.println("리스트페이지");
		break;
		case 2:
		System.out.println("입력페이지");
		break;
		case 3:
		System.out.println("수정페이지");
		break;
		default :
		System.out.println("이용해주셔서 감사합니다");
	}

}


}