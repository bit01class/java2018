class Ex47{
/*
�ڹٴ� Ŭ��������
 Ŭ���� ����
	1. �޼���
	2. ����(Ŭ��������, �ɹ��ʵ�)
	  ���� 1. ������ ����� �ʱ�ȭ�� ���ÿ� �Ǿ�߸� ��
	  ���� 2. ���� ���� ���, ����Ʈ ���� ����
*/
public static int a=54321;// Ŭ�������� - ��������, static����
public int b=12345; // �ɹ��ʵ� -non-static ����
public static c;

public static void main(String[] args){

	int val1=func01();
	System.out.println(val1);

	Ex47 ex47 = new Ex47();
	int val2=ex47.func02();
	System.out.println(val2);
} // main end

public static int func01(){
	System.out.println("static �޼���");
	return 1234;
} // func01 end


public int func02(){
	System.out.println("non-static �޼���");
	return 4321;
}


}