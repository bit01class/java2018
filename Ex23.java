class Ex23{

public static void main(String[] args){
// �Է�
System.out.print("�Է�(1.����Ʈ 2.�Է� 3.���� 0.����) >");
java.util.Scanner scan=new java.util.Scanner(System.in);
int su=scan.nextInt();

	switch(su){
		case 1:
		System.out.println("����Ʈ������");
		break;
		case 2:
		System.out.println("�Է�������");
		break;
		case 3:
		System.out.println("����������");
		break;
		default :
		System.out.println("�̿����ּż� �����մϴ�");
	}

}


}