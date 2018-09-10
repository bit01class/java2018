class Ex51{
public int su=4321;

public static void main(String[] args){

	Ex51 ex51;
	ex51=new Ex51();
	ex51.func01(ex51);

}

public void func01(Ex51 you){
	su=2222;

	int su;
	su=1111;
	System.out.println("su="+su);
	//Ex51 me = new Ex51();
	System.out.println("me.su="+you.su);
}


}