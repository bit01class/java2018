package com.bit.day13;

import java.io.InputStream;

/*
 * �ֹι�ȣ Ȯ��
 * --------------
 * �ֹι�ȣ���Է�>1234561234567
 * �Է��Ͻ� �ֹι�ȣ�� 123456-1234567�Դϴ�
 * 
 * �ֹι�ȣ���Է�>123456-1234567
 * '-'�� �����ϰ� �ۼ��ϼ���
 * ----------------------------
 * 
 * 0001010000000
 * min=1010000000
 * max=9912312000000
 * 1234561234567
 * (int)1234561234567-1234560000000
 * 
 * 123456-1234567
 * 
*/
public class Ex06 {

	public static void main(String[] args) {
		InputStream is = System.in;
		java.util.Scanner sc = new java.util.Scanner(is);
		long jumin=0;
		
		System.out.println("-------------------------------------\n�ֹι�ȣ Ȯ��\n----------------------------------");
		boolean result=true;
		while(result){
			System.out.print("�ֹι�ȣ �Է�>");
			try{
			jumin=sc.nextLong();
			}catch(java.util.InputMismatchException e){
				System.out.println("���ڸ� �Է��ϼ���");
				sc=new java.util.Scanner(is);
				continue;
			}
			//min=1010000000
			//max=9912312999999
			if(jumin<1010000000L || jumin>9912312999999L){
				System.out.println("�ٽ� Ȯ���Ͻð� �Է��ϼ���(�߸��� �ֹι�ȣ)");
				continue;
			}
			System.out.print("�Է��Ͻ� �ֹι�ȣ�� ");
			System.out.print(jumin/10000000);
			System.out.print('-');
			System.out.println(jumin-jumin/10000000*10000000+"�Դϴ�");
			result=false;
		}
	}

}



















