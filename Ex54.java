class Ex54{
public static int sum, cnt;
//public static double avg;
public int kor,eng,math;

public static void main(String[] args){
// �л��������� ���α׷�(ver 0.0.3)
	String bar="-";
	for(int i=0; i<6; i++){
		bar+=bar;
	}
	String result=bar+"\n����\t����\t����\t�հ�\t���\n"
			+bar+"\n";
	
	System.out.println(bar);
	System.out.println("�л��������� ���α׷�(ver 0.0.3)");
	System.out.println(bar);
	double avg;
	Ex54 stu;
	while(true){
		cnt++;
		stu=new Ex54();
		stu.kor=input("����");
		stu.eng=input("����");
		stu.math=input("����");

		result+=stu.kor+"\t"+stu.eng+"\t"
			+stu.math+"\t"+stu.tot()+"\t"+stu.mean()+"\n";

		System.out.println(result);
		System.out.println("�� ������ "+sum);
		System.out.println("�� ����� "+sum*100/(3*cnt)/100.0);

		int temp=0;
		while(true){
			temp=input("����Ͻðڽ��ϱ�?(1.��� 0.����)");
			if(temp==0){
				break;
			}else if(temp==1){
				break;
			}else{
				System.out.println("0�Ǵ�1�� �Է°���");
			}
		}
		if(temp==0){break;}		
	}
	System.out.println("�̿��� �ּż� �����մϴ�!!!");
}

public static int input(String msg){ // 0~100���̰��� �Է¹޾� ����
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int su=0;
	String re="�ٽ� "+msg;
	while(true){
		System.out.print(msg+">>>");
		su=sc.nextInt();
		if(su>=0 && su<=100){
			break;
		}else{
			System.out.println("0~100���̸� �Է��ϼ���");
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