/*
Q1. a,b,c=4,9,1
	1 < 4 < 9
*/

class Ex55{
	public static void ex02(){
		int a,b,c;
		a=24;
		b=9;
		c=11;
		if(a<b && a<c && b<c){
				System.out.println(a+" < "+b+" < "+c);
		}else if(a<b && a<c && c<b){
				System.out.println(a+" < "+c+" < "+b);
		}else if(b<a && b<c && a<c){
				System.out.println(b+" < "+a+" < "+c);
		}else if(b<a && b<c && c<a){
				System.out.println(b+" < "+c+" < "+a);
		}else if(c<a && c<b && a<b){
				System.out.println(c+" < "+a+" < "+b);
		}else if(c<a && c<b && b<a){
				System.out.println(c+" < "+b+" < "+a);
		}

	}

	public static void main(String[] args){
		ex02();

	}
	public static void ex01(){
		int a,b,c;
		a=24;
		b=9;
		c=11;
		if(a<b && a<c){
			System.out.print(a+" < ");
			if(b<c){
				System.out.println(b+" < "+c);
			}else{
				System.out.println(c+" < "+b);
			}
		}else if(b<a && b<c){
			System.out.print(b+" < ");
			if(a<c){
				System.out.println(a+" < "+c);
			}else{
				System.out.println(c+" < "+a);
			}
		}else{
			System.out.print(c+" < ");
			if(a<b){
				System.out.println(a+" < "+b);
			}else{
				System.out.println(b+" < "+a);
			}
		}

	}
	

}