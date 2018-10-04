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
				System.out.println("정상삭제 되었습니다");
			}else{
//				System.out.println("삭제실패");
				System.out.print("계속 삭제하시겠습니까(Y/N)?");
				if("Y".equals(sc.nextLine())){
					String[] temp = file.list();
					for(int i=0; i<temp.length; i++){
						File target=new File(file.getName()+"\\"+temp[i]);
						target.delete();
					}
					file.delete();
					System.out.println("삭제 성공");
				}else{
					System.out.println("삭제실패");
				}
			}
		}
	}

}
















