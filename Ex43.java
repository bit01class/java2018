class Ex43{
/*	------------------------------
	��Ʈ����DC
	------------------------------
	1.�Ա� 2.��� 3.�ܾ׺��� 0.����>6
	�ٽ� Ȯ���ϰ� �Է����ּ���

	1.�Ա� 2.��� 3.�ܾ׺��� 0.����>3
	������>0��

	1.�Ա� 2.��� 3.�ܾ׺��� 0.����>1
	�Աݾ�>1000

	1.�Ա� 2.��� 3.�ܾ׺��� 0.����>3
	������>1000��

	1.�Ա� 2.��� 3.�ܾ׺��� 0.����>2
	�����>500
	
	1.�Ա� 2.��� 3.�ܾ׺��� 0.����>3
	������>500��

	1.�Ա� 2.��� 3.�ܾ׺��� 0.����>0
	�̿����ּż� �����մϴ�

*/

	public static void main(String[] args){
		String title="------------------------------\n��Ʈ����DC\n------------------------------";
		String menu="1.�Ա� 2.��� 3.�ܾ׺��� 0.����>";

		System.out.println(title);
		java.util.Scanner scan=new java.util.Scanner(System.in);

		boolean stop=false;
		while(!stop){
			System.out.print(menu);
			int input=scan.nextInt();

			switch(input){
			case 0://����
				stop=true;
				System.out.println("�̿����ּż� �����մϴ�");
				break;
			case 1://�Ա�
				break;
			case 2://���
				break;
			case 3://�ܾ׺���
				break;
			default ://ó������ �ٽ�
				System.out.println("�ٽ� Ȯ���ϰ� �Է����ּ���");
			}//switch end
			

		}
	}// main end


}// class end























