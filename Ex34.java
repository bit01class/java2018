class Ex34{

public static void main(String[] args){
// ���ڸ� �ϳ����� ���ϰ��� ���� �����̶�� �̸��� �޼���
// �л� �������� ���α׷�(ver.0.0.2)
int kor,eng, math;


System.out.println("------------------------------------------------");
System.out.println("�����������α׷�(ver 0.0.2)");
System.out.println("------------------------------------------------");
System.out.println("����\t����\t����\t�հ�\t���\t����");
System.out.println("------------------------------------------------");

kor=71;
eng=86;
math=93;
myPrint(kor,eng,math);

kor=65;
eng=96;
math=85;
myPrint(kor,eng,math);

kor=68;
eng=76;
math=65;
myPrint(kor,eng,math);


}//main end

public static void myPrint(int kor, int eng, int math){
	System.out.println(kor+"\t"+eng+"\t"+math+"\t"+tot(kor,eng,math)
		+"\t"+avg(kor,eng,math)+"\t"+grade(kor,eng,math));

}

public static int tot(int a, int b, int c){
	int tot=a+b+c;
	return tot;
}

public static double avg(int a, int b, int c){
	double avg=(tot(a,b,c))*100/3/100.0;
	return avg;
}

public static char grade(int a, int b, int c){
	char ch='F';
	double avg=avg(a,b,c);
	switch((int)avg/10){
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
}

}// class end








