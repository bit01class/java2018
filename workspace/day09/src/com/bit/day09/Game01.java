package com.bit.day09;
/*
---------------------------------
����, ����, �� ���� (ver 0.0.1)
---------------------------------
1.���� 2.���� 3.�� 0.����>>1
com:����, you:����
�����ϴ�

1.���� 2.���� 3.�� 0.����>>2
com:��, you:����
�����ϴ�

1.���� 2.���� 3.�� 0.����>>1
com:��, you:����
�̰���ϴ�

1.���� 2.���� 3.�� 0.����>>1
com:����, you:����
�����ϴ�

1.���� 2.���� 3.�� 0.����>>0
��� : 1�� 1�� 2��

*/
public class Game01 {
	static int a,b,c;


	public static void main(String[] args) {
		String title="---------------------------------\n"
						+"����, ����, �� ���� (ver 0.0.1)\n"
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
			/// ����
			result(ran,input);
			
		}
		System.out.println("��� : "+a+"�� "+b+"�� "+c+"��");
	}
	
	public static int userInput(){
		String menu="1.���� 2.���� 3.�� 0.����>>";
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print(menu);
		int su=sc.nextInt();
		if(su<0||su>3){
			System.out.println("err)�Է��� 0~3�̳��� �Է�");
			su=userInput();
		}
		return su;
	}
	
	public static void result(int ran, int input){
		if(ran==input){
			System.out.println("�����ϴ�");
			b++;
		}else if((input==1&&ran==3)
				||(input==2&&ran==1)
				||(input==3&&ran==2)){
			System.out.println("�̰��");
			a++;
		}else{
			System.out.println("����");
			c++;
		}
		
	}
	
	public static void show(int a, String msg,char ch){
		String msg2="";
		if(a==1){
			msg2="����";
		}else if(a==2){
			msg2="����";
		}else if(a==3){
			msg2="��";
		}
		System.out.print(msg+":"+msg2+ch);
	}

}















