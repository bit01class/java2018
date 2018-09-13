package com.bit.day09;
/*
---------------------------------
가위, 바위, 보 게임 (ver 0.0.1)
---------------------------------
1.가위 2.바위 3.보 0.종료>>1
com:가위, you:가위
비겼습니다

1.가위 2.바위 3.보 0.종료>>2
com:보, you:바위
졌습니다

1.가위 2.바위 3.보 0.종료>>1
com:보, you:가위
이겼습니다

1.가위 2.바위 3.보 0.종료>>1
com:바위, you:가위
졌습니다

1.가위 2.바위 3.보 0.종료>>0
결과 : 1승 1무 2패

*/
public class Game01 {
	static int a,b,c;


	public static void main(String[] args) {
		String title="---------------------------------\n"
						+"가위, 바위, 보 게임 (ver 0.0.1)\n"
						+"---------------------------------";
		System.out.println(title);
		int ran=0;
		
		while(true){
			int input=userInput();
			if(input==0){
				break;
			}
			while(!(ran>=1&&ran<4)){
				ran=(int)(Math.random()*10)+1;// 0.0+1 <= <10.0+1 // 1~3
			}
			show(ran,"com",',');
			show(input,"you",'\n');
			/// 승패
			result(ran,input);
			
		}
		System.out.println("결과 : "+a+"승 "+b+"무 "+c+"패");
	}
	
	public static int userInput(){
		String menu="1.가위 2.바위 3.보 0.종료>>";
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print(menu);
		int su=sc.nextInt();
		if(su<0||su>3){
			System.out.println("err)입력은 0~3이내만 입력");
			su=userInput();
		}
		return su;
	}
	
	public static void result(int ran, int input){
		if(ran==input){
			System.out.println("비겼습니다");
			b++;
		}else if((input==1&&ran==3)
				||(input==2&&ran==1)
				||(input==3&&ran==2)){
			System.out.println("이겼다");
			a++;
		}else{
			System.out.println("졌음");
			c++;
		}
		
	}
	
	public static void show(int a, String msg,char ch){
		String msg2="";
		if(a==1){
			msg2="가위";
		}else if(a==2){
			msg2="바위";
		}else if(a==3){
			msg2="보";
		}
		System.out.print(msg+":"+msg2+ch);
	}

}
















