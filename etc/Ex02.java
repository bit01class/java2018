class Ex02{

public static void main(String[] args){
// break, continue, return

for(int i=0; i<5; i++){
	if(i==2){
		System.exit(0);
	}	
	System.out.println("i="+i);
}
	System.out.print("main end");
	return;	
}

}