class Ex24{

public static void main(String[] args){
	// 제어문-반목분
	// for문
/*

for(초기화;조건식;증감){
	반목명령;
}

*/
	for(int i=1; i>0; i++){
		System.out.println("안녕하세요"+i);
	}


	int dan=9;
	System.out.println("구구단 "+dan+"단");
	System.out.println("----------------------------");
	int su=1;
	System.out.println(dan+"x"+su+"="+dan*su);
	su++;
	System.out.println(dan+"x"+su+"="+dan*su);
	su++;
	System.out.println(dan+"x"+su+"="+dan*su);
	su++;
	System.out.println(dan+"x"+su+"="+dan*su);
	su++;
	System.out.println(dan+"x"+su+"="+dan*su);
	su++;
	System.out.println(dan+"x"+su+"="+dan*su);
	su++;
	System.out.println(dan+"x"+su+"="+dan*su);
	su++;
	System.out.println(dan+"x"+su+"="+dan*su);
	su++;
	System.out.println(dan+"x"+su+"="+dan*su);
	su++;
	System.out.println("----------------------------");
	for(int su2=1;su2<10;su2++){
	System.out.println(dan+"x"+su2+"="+dan*su2);
	}


}



}