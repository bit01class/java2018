class Ex05{

	public static void main(String[] args){

		// ����
		// x*y=z

		// ������(4byte)-2^31 ~ 2^31-1 (-2147483648 ~ 2147483647)
		int x; // ������ ����
		x=100; // ������ �ʱ�ȭ
		System.out.println(x-10);
		System.out.println("---------------------");
		// �Ǽ���0x0.0000000000001P-1022 ~ 0x1.fffffffffffffP+1023
		double y;
		y=3.14;
		System.out.println(y-3);
		System.out.println("---------------------");
		// ������(2byte)  u0000 ~  uffff (0 ~ 2^15-1)
		char a;
		a='a';
		System.out.println(a);
		System.out.println("-----------------------");
		// �Ҹ���(1bit)     true, false
		boolean b;
		b=true;
		System.out.println(b);
		System.out.println("-----------------------");
		// ���ڿ�
		String c;
		c="���ڿ� �Դϴ�";
		System.out.println(c);
	}



}









