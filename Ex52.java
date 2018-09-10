/*
	static -> static 
	non-static-> non-static
	non-static -> static
			그냥 접근
	---------------
	static -> non-static 참조변수로 접근
*/

class Ex52{
	public static int su1;
	public int su2;
	
	public static void func01(){
		System.out.println("static method...");
	}

	public void plus01(int a){
		su1+=a;
	}

	public void plus02(int a){
		su2+=a;
	}

}