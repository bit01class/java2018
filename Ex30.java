class Ex30{

public static void main(String[] args){

	for(int a=0; a<5; a++){
		System.out.println("¹Û");
		for(int b=0; b<3; b++){
			System.out.println("¾È");
		}

	}
	System.out.println("---------------------------------");
	for(int n=2;n<10; n++){
		for(int m=1; m<10; m++){
		System.out.println(n+"x"+m+"="+n*m);
		}
	}
	System.out.println("---------------------------------");
	// 2*1 3*1 4*1 ... 8*1 9*1
	// 2*2 3*2 4*2 ... 8*2 9*2
	// ....
	// 2*9

	for(int su=1;su<10;su++){
		for(int dan=2; dan<10; dan++){
		System.out.print(dan+"x"+su+"="+dan*su+"\t");
		}
		System.out.println();
	}
}


}














