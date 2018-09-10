class Ex54{
public static int sum, cnt;
//public static double avg;
public int kor,eng,math;

public static void main(String[] args){
// 학생성적관리 프로그램(ver 0.0.3)
	String bar="-";
	for(int i=0; i<6; i++){
		bar+=bar;
	}
	String result=bar+"\n국어\t영어\t수학\t합계\t평균\n"
			+bar+"\n";
	
	System.out.println(bar);
	System.out.println("학생성적관리 프로그램(ver 0.0.3)");
	System.out.println(bar);
	double avg;
	Ex54 stu;
	while(true){
		cnt++;
		stu=new Ex54();
		stu.kor=input("국어");
		stu.eng=input("영어");
		stu.math=input("수학");

		result+=stu.kor+"\t"+stu.eng+"\t"
			+stu.math+"\t"+stu.tot()+"\t"+stu.mean()+"\n";

		System.out.println(result);
		System.out.println("반 총점은 "+sum);
		System.out.println("반 평균은 "+sum*100/(3*cnt)/100.0);

		int temp=0;
		while(true){
			temp=input("계속하시겠습니까?(1.계속 0.종료)");
			if(temp==0){
				break;
			}else if(temp==1){
				break;
			}else{
				System.out.println("0또는1만 입력가능");
			}
		}
		if(temp==0){break;}		
	}
	System.out.println("이용해 주셔서 감사합니다!!!");
}

public static int input(String msg){ // 0~100사이값을 입력받아 리턴
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int su=0;
	String re="다시 "+msg;
	while(true){
		System.out.print(msg+">>>");
		su=sc.nextInt();
		if(su>=0 && su<=100){
			break;
		}else{
			System.out.println("0~100사이만 입력하세요");
			msg=re;
		}
	}
	return su;
}

public int tot(){
	return kor+eng+math;
}

public double mean(){
	sum+=kor+eng+math;
	return tot()*100/3/100.0;
}


}