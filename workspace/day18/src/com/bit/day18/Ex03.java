package com.bit.day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface Machine{
	void on();
	void off();
	void work();
}

class Tv implements Machine{
	public void on(){
		System.out.println("Tv�� �Ѵ�");
	}
	public void off(){
		System.out.println("Tv�� ����");
	}
	public void work(){
		System.out.println("����� ȭ�鿡 ����Ѵ�");
	}
}

class Radio implements Machine{
	public void on(){
		System.out.println("������ �Ѵ�");
	}
	public void off(){
		System.out.println("������ ����");
	}
	public void work(){
		System.out.println("����� �����Ͽ� �Ҹ��� ����ش�");
	}
}

class Audio implements Machine{
	public void on(){
		System.out.println("������� �Ѵ�");
	}
	public void off(){
		System.out.println("������� ����");
	}
	public void work(){
		System.out.println("���� ���� ������ ����ش�");
	}
}


public class Ex03 {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("tv", "com.bit.day18.Tv");
		map.put("radio", "com.bit.day18.Radio");
		map.put("audio", "com.bit.day18.Audio");
		
		Scanner sc = new Scanner(System.in);
		int remote=0;
		Machine machine=null;
		String info=null;
		while(true){
			System.out.print("1.tv 2.radio 3.audio 0.����>");
			remote=sc.nextInt();
			if(remote==0){
				break;
			}else if(remote==1){
				info=map.get("tv");//				machine=new Tv();
			}else if(remote==2){
				info=map.get("radio");
			}else if(remote==3){
				info=map.get("audio");
			}
			
			try {
				Class<?> clz = Class.forName(info);
				machine=(Machine) clz.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
			System.out.print("0.off 1.on 2.work>");
			remote=sc.nextInt();
			if(remote==0){
				machine.off();
			}else if(remote==1){
				machine.on();
			}else if(remote==2){
				machine.work();
			}
		}
	}

}





















