package com.bit.day10;

public class Ex12 {

	public static void main(String[] args) {
		// 로또 번호 생성기
		// 방법3가지
		// 1 ~ 45 공 공추첨-
		// 랜덤
		// 중복검출
		// 오름차순
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
		System.out.println("\t + 뽀너스 번호:"+lotto[6]);
	}

}














