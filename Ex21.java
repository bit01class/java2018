class Ex21{

public static void main(String[] args){


String msg;
msg=args[0];
System.out.println("입력내용은 "+msg);
if(msg=="java"){
	System.out.println("java와 같다");
}else if(msg=="web"){
	System.out.println("web과 같다");
}else{
	System.out.println("다르다");
}
// jdk 1.6~ 
switch(msg){
	case "java":
		System.out.println("java를 입력함");
		break;
	case "web":
		System.out.println("web을 입력함");
		break;
}


}

}