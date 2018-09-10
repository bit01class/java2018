class Ex43{
/*	------------------------------
	비트은행DC
	------------------------------
	1.입금 2.출금 3.잔액보기 0.종료>6
	다시 확인하고 입력해주세요

	1.입금 2.출금 3.잔액보기 0.종료>3
	남은돈>0원

	1.입금 2.출금 3.잔액보기 0.종료>1
	입금액>1000

	1.입금 2.출금 3.잔액보기 0.종료>3
	남은돈>1000원

	1.입금 2.출금 3.잔액보기 0.종료>2
	인출액>500
	
	1.입금 2.출금 3.잔액보기 0.종료>3
	남은돈>500원

	1.입금 2.출금 3.잔액보기 0.종료>0
	이용해주셔서 감사합니다

*/

	public static void main(String[] args){
		int money=0;
		String title="------------------------------\n비트은행DC\n------------------------------";
		String menu="1.입금 2.출금 3.잔액보기 0.종료>";
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println(title);
		Ex43 me = new Ex43();
		boolean stop=false;
		while(!stop){
			System.out.print(menu);
			int input=scan.nextInt();

			switch(input){
			case 0://종료
				stop=true;
				System.out.println("이용해주셔서 감사합니다");
				break;
			case 1://입금
				money=me.edit(money,'입');
				break;
			case 2://출금
				money=me.edit(money,'출');
				break;
			case 3://잔액보기
				me.show(money);				
				break;
			default ://처음부터 다시
				System.out.println("다시 확인하고 입력해주세요");
			}//switch end
		}
	}// main end

	public void show(int money){
		System.out.println("남은돈> "+money+"원");
	}

	public int edit(int money, char ch){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.print(ch+"금액>");
		if(ch=='입'){
			money+=scan.nextInt();
		}else{
			money-=scan.nextInt();
		}
		return money;
	}
	/*
	public int add(int money){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.print("입금액>");
		money+=scan.nextInt();
		return money;
	}

	public int minus(int money){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.print("출금액>");
		money-=scan.nextInt();
		return money;
	}
	*/
}// class end























