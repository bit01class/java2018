/*

 	# # ¡Ú 
 	# ¡Ú ¡Ú   
 	¡Ú ¡Ú ¡Ú 

 	    ¡Ú 
 	  ¡Ú ¡Ú ¡Ú  
 	¡Ú ¡Ú ¡Ú ¡Ú ¡Ú
 	  ¡Ú ¡Ú ¡Ú  
 	    ¡Ú 

*/

class Ex57{

public static void main(String[] args){

	for(int i=0; i<3; i++){
		for(int j=-2; j<3; j++){
			if(i>=abs(j)){
				System.out.print("¡Ú ");
			}else{
				System.out.print("   ");
			}
		}
		System.out.println();
	}
	for(int i=0; i<2; i++){
		for(int j=-2; j<3; j++){
			if(2-i>abs(j)){
				System.out.print("¡Ú ");
			}else{
				System.out.print("   ");
			}
		}
		System.out.println();
	}

	

}
public static int abs(int a){
	if(a<0){
		a=-a;
	}
	return a;
}

public static void func02(){
	for(int i=0; i<3; i++){
		for(int j=0; j<5; j++){
			if(j>2){
				if(i>j-3){
					System.out.print("¡Ú ");
				}
			}else{
				if(j>=2-i){
				System.out.print("¡Ú ");			
				}else{
				System.out.print("   ");
				}	
			}
		}
		System.out.println();
	}

}

public static void func01(){
	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			if(j>=2-i){
				System.out.print("¡Ú ");			
			}else{
				System.out.print("   ");
			}
		}
		System.out.println();
	}
	
}

}