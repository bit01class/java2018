class Ex15{

public static void main(String[] args){
	//������
	// �켱���� 1>5
	//1. ���� ������(++,--)
	int a=5;
	++a;//6
	a++;//6 ������ a�� �����ϸ� 7
	//2. ��� ������
	// ��Ģ����(+ - * / %)

	//3. �� ������(���: boolean)
	// <, >, <= , >=, ==(����񱳿�����), !=
	boolean result;
	result=a!=6;
	System.out.println(result);
	//4. �� ������(a b = boolean)
	// && (and)
	// || (or)
	// ! (not)
	boolean x=true;
	boolean y=true;

	System.out.println(x+"&&"+y+"="+(x&&y));	
	System.out.println(x+"||"+y+"="+(x||y));
	x=false;
	y=false;
	System.out.println(x+"&&"+y+"="+(x&&y));	
	System.out.println(x+"||"+y+"="+(x||y));
	x=true;
	y=false;
	System.out.println(x+"&&"+y+"="+(x&&y));	
	System.out.println(x+"||"+y+"="+(x||y));
	System.out.println("------------------------------");
	System.out.println(!true);
	System.out.println(!false);
	//5. ���� ������(=,+=,-=,*=,/=)
	a=2;
	a*=2+10;// a=a*(2+10);
	System.out.println(a);

}

}











