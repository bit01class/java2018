package com.bit.day13;
/* -----------------------------
 * �ֹι�ȣ �˻�
 * -----------------------------
 * �ֹι�ȣ�� �Է��ϼ���>123456-1234567
 * ����� 00�� �����Դϴ�
 * 
 * �ֹι�ȣ�� �Է��ϼ���>123456-2234567
 * ����� 00�� �����Դϴ�
 * 
 * �ֹι�ȣ�� �Է��ϼ���>���̻�����-���̻�����ĥ
 * ����� 00�� �����Դϴ�
 * 
 * ------------------------------------
 * 
 * �ֹι�ȣ Ư¡
 * 6�ڸ�-7�ڸ�
 * 2-�⵵	-	ù�ڸ� ����
 * 99 		-	1����, 2����
 * 							, (9 �ܱ���)
 * 00		-	3����, 4����
 * 
 * ------------------------------------
 * �ֹι�ȣ�� �Է��ϼ���>1234562234567
 * '-'�� �������� ������
 * �ֹι�ȣ�� �Է��ϼ���>
 * 
 * �ֹι�ȣ�� �Է��ϼ���>123456-12345678
 * �ֹι�ȣ ������ 000000-0000000�Դϴ�
 * �ֹι�ȣ�� �Է��ϼ���>12345-61234567
 * �ֹι�ȣ ������ 000000-0000000�Դϴ�
 * �ֹι�ȣ�� �Է��ϼ���>1234561-234567
 * �ֹι�ȣ ������ 000000-0000000�Դϴ�
 * 
*/
public class Ex01 {
	final static String bar="------------------------------------";
	final static String title="�ֹι�ȣ �˻�";
	final static String menu="�ֹι�ȣ�� �Է��ϼ���>";

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input="";
		
		System.out.println(bar);
		System.out.println(title);
		System.out.println(bar);
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			
			char[] temp=input.toCharArray();
			int cnt=0;
			for(int i=0; i<temp.length; i++){
				if(temp[i]=='-'){cnt++;}
			}
			if(cnt!=1){
				System.out.println("'-'�� �������� ������");
				continue;
			}
			
			if(temp.length!=14 || temp[6]!='-'){
				System.out.println("�ֹι�ȣ ������ 000000-0000000�Դϴ�");
				continue;
			}
			
			int year=(temp[0]-'0')*10+temp[1]-'0';
			int age=1;
			if(temp[7]=='1'||temp[7]=='2'){
				age+=2018-(1900+year);
			}else if(temp[7]=='3'||temp[7]=='4'){
				age+=2018-(2000+year);
			}
			
			if(temp[7]=='1'|| temp[7]=='3'){
				temp[7]='��';
			}else if(temp[7]=='2'||temp[7]=='4'){
				temp[7]='��';
			}
			
			System.out.println("����� "+age+"�� "+temp[7]+"���Դϴ�");
			break;
		}
	}

}












