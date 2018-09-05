class Ex18{

public static void main(String[] args){
// su=34;
// 1. 양수이고 홀수입니다
// 2. 양수이고 짝수입니다
// 3. 음수이고 홀수입니다
// 4. 음수이고 짝수입니다
// 5. 0입니다
	int su=-30;
	if(su>0 && su%2!=0){
		System.out.println("양수이고 홀수입니다");
	}else if(su>0 && su%2==0){
		System.out.println("양수이고 짝수입니다");
	}else if(su<0 && su%2!=0){
		System.out.println("음수이고 홀수입니다");
	}else if(su<0 && su%2==0){
		System.out.println("음수이고 짝수입니다");
	}else{
		System.out.println("0입니다");
	}
	System.out.println("---------------------------");
	if(su>0){
		System.out.print("양수이고"); 
		if(su%2==0){
		    System.out.println(" 짝수입니다");
		}else{
		    System.out.println(" 홀수입니다");
		}
	}else if(su<0){
		System.out.print("음수이고"); 
		if(su%2==0){
		    System.out.println(" 짝수입니다");
		}else{
		    System.out.println(" 홀수입니다");
		}
	}else{
		System.out.println("0입니다");
	}
	System.out.println("------------------------------");
	char ch1='음';
	char ch2='홀';
	if(su==0){
		System.out.println("0입니다");
	}else{
		if(su>0){
			ch1='양';
		}
		if(su%2==0){
			ch2='짝';
		}
		System.out.println(ch1+"수이고 "+ch2+"수입니다");
	}


}


}








