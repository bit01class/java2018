class Ex18{

public static void main(String[] args){
// su=34;
// 1. ����̰� Ȧ���Դϴ�
// 2. ����̰� ¦���Դϴ�
// 3. �����̰� Ȧ���Դϴ�
// 4. �����̰� ¦���Դϴ�
// 5. 0�Դϴ�
	int su=-30;
	if(su>0 && su%2!=0){
		System.out.println("����̰� Ȧ���Դϴ�");
	}else if(su>0 && su%2==0){
		System.out.println("����̰� ¦���Դϴ�");
	}else if(su<0 && su%2!=0){
		System.out.println("�����̰� Ȧ���Դϴ�");
	}else if(su<0 && su%2==0){
		System.out.println("�����̰� ¦���Դϴ�");
	}else{
		System.out.println("0�Դϴ�");
	}
	System.out.println("---------------------------");
	if(su>0){
		System.out.print("����̰�"); 
		if(su%2==0){
		    System.out.println(" ¦���Դϴ�");
		}else{
		    System.out.println(" Ȧ���Դϴ�");
		}
	}else if(su<0){
		System.out.print("�����̰�"); 
		if(su%2==0){
		    System.out.println(" ¦���Դϴ�");
		}else{
		    System.out.println(" Ȧ���Դϴ�");
		}
	}else{
		System.out.println("0�Դϴ�");
	}
	System.out.println("------------------------------");
	char ch1='��';
	char ch2='Ȧ';
	if(su==0){
		System.out.println("0�Դϴ�");
	}else{
		if(su>0){
			ch1='��';
		}
		if(su%2==0){
			ch2='¦';
		}
		System.out.println(ch1+"���̰� "+ch2+"���Դϴ�");
	}


}


}








