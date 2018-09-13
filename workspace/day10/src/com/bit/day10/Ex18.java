package com.bit.day10;

class Ball2{
	int num;
	boolean marking;
	String color;
}

public class Ex18 {

	public static void main(String[] args) {
		Ball2[] balls=new Ball2[45];
		Ball2[] box=new Ball2[6];

		for(int i=0; i<balls.length; i++){
			balls[i]=new Ball2();
			balls[i].num=i+1;
			balls[i].marking=false;
			if(i<10){
				balls[i].color="���";
			}else if(i<20){
				balls[i].color="������";
			}else if(i<30){
				balls[i].color="�Ķ���";
			}else{
				balls[i].color="������";
			}
		}
		
		for(int i=0; i<6; i++){
			Ball2 ball=balls[(int)(Math.random()*45)];
			if(ball.marking==true){
				i--;
				}else{
					ball.marking=true;
					box[i]=ball;
				}
		}
		
		for(int i=0; i<box.length; i++){
			System.out.println(box[i].color+" ��:"+box[i].num);
		}
	}

}
















