/*
	static -> static 
	non-static-> non-static
	non-static -> static
			�׳� ����
	---------------
	static -> non-static ���������� ����
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