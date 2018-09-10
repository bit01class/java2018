class Ex49{
public int su=4321;

public static void main(String[] args){
	Ex49 ex49 = new Ex49();
	System.out.println("su="+ex49.su);
	func01();
	ex49.func02();
	System.out.println("ex48 su="+Ex48.su);
	Ex48.su=6789;
	System.out.println("ex48 su="+Ex48.su);
}

public static void func01(){
	Ex49 me = new Ex49();
	System.out.println(me.su);
}

public void func02(){
	System.out.println("func02() - su="+su);
}


}