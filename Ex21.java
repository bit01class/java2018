class Ex21{

public static void main(String[] args){


String msg;
msg=args[0];
System.out.println("�Է³����� "+msg);
if(msg=="java"){
	System.out.println("java�� ����");
}else if(msg=="web"){
	System.out.println("web�� ����");
}else{
	System.out.println("�ٸ���");
}
// jdk 1.6~ 
switch(msg){
	case "java":
		System.out.println("java�� �Է���");
		break;
	case "web":
		System.out.println("web�� �Է���");
		break;
}


}

}