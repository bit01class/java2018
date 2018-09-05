class Ex20{

public static void main(String[] args){
/* 
국어 : 86
영어 : 74
수학 : 69
이들 성적을 출력하시오(평균은 소수둘째자리까지)

-------------------------------------
 성적 관리 프로그램
-------------------------------------
국어 | 86
영어 | 74
수학 | 69
합계 | xxxx
평균 | xx.xx
--------------------------------------
학점 | C학점
*/
int kor,eng,math,sum;
double avg;
kor=100;
eng=100;
math=100;
sum=kor+eng+math;
avg=100*sum/3/100.0;//avg=(double)(sum*100/3)/100;

System.out.println("-------------------------------------");
System.out.println("성적관리 프로그램");
System.out.println("-------------------------------------");
System.out.println("국어 | "+kor);
System.out.println("영어 | "+eng);
System.out.println("수학 | "+math);
System.out.println("합계 | "+sum);
System.out.println("평균 | "+avg);
System.out.println("-------------------------------------");
System.out.print("학점 | ");

switch((int)(avg/10)){
// sum A : 270<= <=300
// sum B : 240<= <270
// sum C : 210<=  <240
// sum D : 180<=  <210
// sum F : <180

	case 9: case 10:
		System.out.println("A학점");
		break;
	case 8: 
		System.out.println("B학점");
		break;
	case 7: 
		System.out.println("C학점");
		break;
	case 6: 
		System.out.println("D학점");
		break;
	default :
		System.out.println("F학점");

}


}


}







