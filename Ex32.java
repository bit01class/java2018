class Ex32{
	// Ŭ������ ����
	// 1. �޼���


	public static void myFunc1(){

		int a;
		a=100;
		System.out.println("���� ���� �޼��� a="+a);
	
	}// myFunc1 end

	public static void main(String[] args){
		System.out.println("main �޼��� ����");
		System.out.println(1234);
		
		int a;
		a=10;
		myFunc1(); // �޼��� ȣ��
		myFunc1(a);
		myFunc1("abcd");		
		myFunc1(2.5, 3);
		myFunc2(1234);
		System.out.println("main �޼��� ���� a="+a);
	}// main end

	public static void myFunc1(int a){
		System.out.println("a="+a);
	}

	public static void myFunc1(String msg){
		System.out.println(msg);
	}

	public static void myFunc1(double a, int b){
		System.out.println(a+"x"+b+"="+a*b);
	}

	public static void myFunc2(double a){
		System.out.println("�Ǽ� :"+a);
	}
	
	public static void myFunc2(int a){
		System.out.println("���� :"+a);
	}
	// �޼���
	// 1. �޼����̸� ù���� ����
	// 2. �δܾ� �̻��� ���տ����� �ι�° �ܾ��� ù���� ����
	// 3. Ű����� �̸����� �Ұ�
	// 4. �޼��� �������� ȣ��-> ����
	// 5. �Ű�����(����)�� ���� ���� ����, �󸶵��� �������� ����
	// 6. �Ϲ������δ� �޼��� ���� �ߺ��Ұ�
	// 	�޼��� �����ε� ����) 
	//		�Ű������� ����, �ڷ���, ����

}// class end











