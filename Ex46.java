class Ex46{

public static void main(String[] args){

	for(int i=0; i<3; i++){
		
		for(int j=-2; j<3; j++){
			if(abs(j)<=i){System.out.print("¡Ú ");}
			else System.out.print("   ");
		}
		System.out.println();
	}
	for(int i=0; i<2; i++){
		
		for(int j=-2; j<3; j++){
			if(abs(j)<=1-i){System.out.print("¡Ú ");}
			else System.out.print("   ");
		}
		System.out.println();
	}

}
public static int abs(int a){
	if(a>=0) return a;
	else return -a;
}

}