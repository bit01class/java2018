class Ex48{

public static int su=1234;

public static void main(String[] args){
	System.out.println("su="+su);
	func01();
	System.out.println("su="+su);
	Ex48 ex48=new Ex48();
	ex48.func02();
	System.out.println("----------------");
	Ex49 ex49 = new Ex49();
	System.out.println("Ex49 su="+ex49.su);
	ex49.su=9876;
	System.out.println("Ex49 su="+ex49.su);
	
}

public static void func01(){
	//System.out.println("func01 su="+su);
	su=1111;
}

public void func02(){
	System.out.println("static su="+su);	
}


}