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
		int money=0;
		String title="------------------------------\n��Ʈ����DC\n------------------------------";
		String menu="1.�Ա� 2.��� 3.�ܾ׺��� 0.����>";
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println(title);
		Ex43 me = new Ex43();
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
				money=me.edit(money,'��');
				break;
			case 2://���
				money=me.edit(money,'��');
				break;
			case 3://�ܾ׺���
				me.show(money);				
				break;
			default ://ó������ �ٽ�
				System.out.println("�ٽ� Ȯ���ϰ� �Է����ּ���");
			}//switch end
		}
	}// main end

	public void show(int money){
		System.out.println("������> "+money+"��");
	}

	public int edit(int money, char ch){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.print(ch+"�ݾ�>");
		if(ch=='��'){
			money+=scan.nextInt();
		}else{
			money-=scan.nextInt();
		}
		return money;
	}
	/*
	public int add(int money){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.print("�Աݾ�>");
		money+=scan.nextInt();
		return money;
	}

	public int minus(int money){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.print("��ݾ�>");
		money-=scan.nextInt();
		return money;
	}
	*/
}// class end























