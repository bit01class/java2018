class Ex35{

public static void main(String[] args){
	// ���ڸ� �ϳ����� ���ϰ��� ���� �����̶�� �̸��� �޼���
	// �л� �������� ���α׷�(ver.0.0.2)
	int kor,eng, math;
	int stop;

	while(true){
		kor=input("����");
		eng=input("����");
		math=input("����");

		System.out.println("------------------------------------------------");
		System.out.println("�����������α׷�(ver 0.0.2)");
		System.out.println("------------------------------------------------");
		System.out.println("����\t����\t����\t�հ�\t���\t����");
		System.out.println("------------------------------------------------");
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+tot(kor,eng,math)
		+"\t"+avg(kor,eng,math)+"\t"+grade(kor,eng,math));
		stop=input("1.��� 0.����");
		if(stop==0){
		break;
		} // if end
	}//while end

}//main end

public static int input(String msg){
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.print(msg+">");
	int tmp=scan.nextInt();
	return tmp;
}// input end

public static int tot(int kor, int eng, int math){
	int tot;
	tot=kor+eng+math;
	return tot;
}// tot end

public static double avg(int kor, int eng, int math){

	double avg;
	avg=tot(kor,eng,math)*100/3/100.0;
	return avg;
}// avg end

public static char grade(int kor, int eng, int math){
	char ch='F';
	switch((int)avg(kor,eng,math)/10){
	case 10: case 9:
		ch=(char)(ch-1);
	case 8:
		ch=(char)(ch-1);
	case 7:
		ch=(char)(ch-1);
	case 6:
		ch=(char)(ch-2);
	default:
		ch=ch;
	}
	return ch;
} // grade end


}// class end








