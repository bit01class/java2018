package com.bit.day13;

public class Ex02 {
	final static String bar="------------------------------------";
	final static String title="�ֹι�ȣ �˻�";
	final static String menu="�ֹι�ȣ�� �Է��ϼ���>";
	
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String result="����� ";
		String input=null;
		System.out.println(bar+"\n"+title+"\n"+bar);
		do{
			System.out.print(menu);
			input=sc.nextLine();
			
			if(input.isEmpty()){
				continue;
			}else if(input.indexOf("-")<0){
				System.out.println("'-'�� �������� ������");
				continue;
			}else if(input.length()!=14){
				System.out.println("�߸��� �ֹι�ȣ �Դϴ�");
				continue;
			}else if(input.indexOf("-")!=6){
				System.out.println("'-'�� �߸� �����ϴ�");
				continue;
			}else{
				// 2018 -1900-99+1=2018-1900+1-99=119-99=100+19-99
				// 2018 -2000-00+1=2018-2000+1-00=19-00=100+19-99-100
				
				String su2=input.substring(0, 2);
				int age=219-Integer.parseInt("1"+su2);
				String su1=input.substring(7,8);
				int su=Integer.parseInt(su1);
				if(su<1||su>4){
					System.out.println("�߸��� �ֹι�ȣ �Դϴ�");
					continue;
				}
				if(su>2){age-=100;}
					result+=age;
				if(su%2==0){
					result+="�� �����Դϴ�";
				}else{
					result+="�� �����Դϴ�";
				}
				System.out.println(result);
				break;
			}
		}while(true);
	}

}















