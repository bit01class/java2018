package com.bit.day10;

public class Ex16 {

	public static void main(String[] args) {
		int cnt=7;
		int[] lotto = new int[cnt];
		for(int i=0; i<cnt; i++){
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){
					i--;
					break;
				}
			}
		}
		int temp=0;
		for(int i=0; i<lotto.length-1-1; i++){
			for(int j=i; j<lotto.length-1; j++){
				if(lotto[i]>lotto[j]){
					temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		for(int i=0; i<lotto.length; i++){
			if(i==6){
				System.out.print(" �ǳʽ���ȣ:");
			}else if(i!=0){
				System.out.print(',');
			} 
			System.out.print(lotto[i]);
		}
	}

}







