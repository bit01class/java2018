class Ex10{

public static void main(String[] args){
int item1=1500;
int item2=900;
int item3=2300;
int item4=2000;

System.out.println("-----------------------------------");
System.out.println("영수증");
System.out.println("-----------------------------------");
System.out.println("품명\t\t단가\t수량\t계");
System.out.println("-----------------------------------");
System.out.println("땅콩과자\t"+item1+"\t1\t"+(item1*1));
System.out.println("물\t\t"+item2+"\t2\t"+item2*2);
System.out.println("커피\t\t"+item3+"\t3\t"+item3*3);
System.out.println("감자칩\t\t"+item4+"\t2\t"+item4*2);
System.out.println("-----------------------------------");
System.out.println("합계:"+(item1*1+item2*2+item3*3+item4*2));


}


}