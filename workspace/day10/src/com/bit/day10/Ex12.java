package com.bit.day10;

public class Ex12 {

	public static void main(String[] args) {
		// �ζ� ��ȣ ������
		// ���3����
		// 1 ~ 45 �� ����÷-
		// ����
		// �ߺ�����
		// ��������
		int[] lotto = new int[45];
		int[] result = new int[6];
		int tmp=0;
		for(int i=0; i<lotto.length; i++){
			// 0~ 44
			lotto[i]=i+1;
		}
		for(int i=0; i<100000; i++){
			int ran=(int)(Math.random()*44)+1;
			tmp=lotto[0];
			lotto[0]=lotto[ran];
			lotto[ran]=tmp;
		}
		
		System.arraycopy(lotto, 0, result, 0, 6);
		
		for(int i=0; i<result.length; i++){
			System.out.print(result[i]+" ");
		}
		System.out.println("\t + �ǳʽ� ��ȣ:"+lotto[6]);
	}

}














