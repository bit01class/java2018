class Ex20{

public static void main(String[] args){
/* 
���� : 86
���� : 74
���� : 69
�̵� ������ ����Ͻÿ�(����� �Ҽ���°�ڸ�����)

-------------------------------------
 ���� ���� ���α׷�
-------------------------------------
���� | 86
���� | 74
���� | 69
�հ� | xxxx
��� | xx.xx
--------------------------------------
���� | C����
*/
int kor,eng,math,sum;
double avg;
kor=100;
eng=100;
math=100;
sum=kor+eng+math;
avg=100*sum/3/100.0;//avg=(double)(sum*100/3)/100;

System.out.println("-------------------------------------");
System.out.println("�������� ���α׷�");
System.out.println("-------------------------------------");
System.out.println("���� | "+kor);
System.out.println("���� | "+eng);
System.out.println("���� | "+math);
System.out.println("�հ� | "+sum);
System.out.println("��� | "+avg);
System.out.println("-------------------------------------");
System.out.print("���� | ");

switch((int)(avg/10)){
// sum A : 270<= <=300
// sum B : 240<= <270
// sum C : 210<=  <240
// sum D : 180<=  <210
// sum F : <180

	case 9: case 10:
		System.out.println("A����");
		break;
	case 8: 
		System.out.println("B����");
		break;
	case 7: 
		System.out.println("C����");
		break;
	case 6: 
		System.out.println("D����");
		break;
	default :
		System.out.println("F����");

}


}


}







