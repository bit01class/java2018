package com.bit.day19;

import java.io.File;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		File file = new File("temp");
		if(file.exists()){
			boolean result=file.delete();
			if(result){
				System.out.println("������� �Ǿ����ϴ�");
			}else{
//				System.out.println("��������");
				System.out.print("��� �����Ͻðڽ��ϱ�(Y/N)?");
				if("Y".equals(sc.nextLine())){
					String[] temp = file.list();
					for(int i=0; i<temp.length; i++){
						File target=new File(file.getName()+"\\"+temp[i]);
						target.delete();
					}
					file.delete();
					System.out.println("���� ����");
				}else{
					System.out.println("��������");
				}
			}
		}
	}

}
















