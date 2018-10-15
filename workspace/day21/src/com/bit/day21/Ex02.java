package com.bit.day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

class Student implements java.io.Serializable{
	public int kor,eng,math;
	
	public int tot(){
		return kor+eng+math;
	}
	
}

public class Ex02 {
	File file;
	String bar ="-----------------------------------------";
	String title="학생성적관리프로그램(ver 0.3.0)";
	String menu="1.리스트 2.입력 3.상세보기 0.종료>";
	ArrayList<Student> list = new ArrayList<>();

	public static void main(String[] args) {
		Ex02 me = new Ex02();
		me.program();
	}
	
	public void initList(){
		InputStream is=null;
		ObjectInputStream ois=null;
		
		try {
			is=new FileInputStream(file);
			ois=new ObjectInputStream(is);
			
			list=(ArrayList<Student>)ois.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				ois.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void program(){
		file = new File("./data.bin");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(bar);
		System.out.println(title);
		System.out.println(bar);
		int su=0;
		while(true){
			initList();
			System.out.print(menu);
			su=inputSu();
			if(su==0){
				break;
			}else if(su==1){
			// 리스트	
				System.out.println(bar);
				System.out.println("학번\t| 국어\t| 영어\t| 수학\t| 합계");
				System.out.println(bar);
				for(int i=0; i<list.size(); i++){
					Student stu=list.get(i);
					System.out.println(i+1+"\t| "+stu.kor+"\t| "+stu.eng+"\t| "+stu.math+"\t| "+stu.tot());
				}
				
			}else if(su==2){
			// 입력
				Student stu= new Student();
				System.out.print("국어>");
				int kor=inputSu();
				System.out.print("영어>");
				int eng=inputSu();
				System.out.print("수학>");
				int math=inputSu();
				stu.kor=kor;
				stu.eng=eng;
				stu.math=math;
				list.add(stu);
				
				OutputStream os=null;
				ObjectOutputStream oos=null;
				try {
					os=new FileOutputStream(file);
					oos=new ObjectOutputStream(os);
					
					oos.writeObject(list);
					oos.flush();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally{
					try {
						oos.close();
						os.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
			}else if(su==3){
			// 상세보기
				System.out.print("학번>");
				int num=inputSu();
				Student stu=list.get(num-1);
				System.out.println(bar);
				System.out.println("학번  | "+num);
				System.out.println("국어  | "+stu.kor);
				System.out.println("영어  | "+stu.eng);
				System.out.println("수학  | "+stu.math);
				System.out.println(bar);
				System.out.println("합계  | "+stu.tot());
				System.out.println(bar);
			}
		}
		System.out.println("이용해 주셔서 감사합니다");
	}
	
	public int inputSu(){
		Scanner sc = new Scanner(System.in);
		String temp=sc.nextLine();
		return Integer.parseInt(temp);
	}

}

















