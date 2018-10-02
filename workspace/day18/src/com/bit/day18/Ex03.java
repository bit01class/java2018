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
		System.out.println("Tv를 켜다");
	}
	public void off(){
		System.out.println("Tv를 끄다");
	}
	public void work(){
		System.out.println("방송을 화면에 출력한다");
	}
}

class Radio implements Machine{
	public void on(){
		System.out.println("라디오를 켜다");
	}
	public void off(){
		System.out.println("라디오를 끄다");
	}
	public void work(){
		System.out.println("방송을 수신하여 소리를 들려준다");
	}
}

class Audio implements Machine{
	public void on(){
		System.out.println("오디오를 켜다");
	}
	public void off(){
		System.out.println("오디오를 끄다");
	}
	public void work(){
		System.out.println("씨디를 돌려 음악을 들려준다");
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
			System.out.print("1.tv 2.radio 3.audio 0.종료>");
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





















