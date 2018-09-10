class Ex53{

	public static void main(String[] args){
	
		//System.out.println(Ex52.su1);
		//Ex52.su1=100;
		//System.out.println(Ex52.su1);


		Ex52 ex1;
		ex1=new Ex52();
		ex1.plus01(10);
		ex1.plus02(10);

		Ex52 ex2;
		ex2=new Ex52();
		ex2.plus01(100);
		ex2.plus02(100);

		Ex52 ex3;
		ex3=new Ex52();
		ex3.plus01(1000);
		ex3.plus02(1000);

		System.out.println("--------------------");
		System.out.println(ex1.su2);
		System.out.println(ex2.su2);
		System.out.println(ex3.su2);
		System.out.println("--------------------");
		System.out.println(ex1.su1);
		System.out.println(ex2.su1);
		System.out.println(ex3.su1);

	}


}