class Ex08{

public static void main(String[] args){

int a=3;

System.out.println((a++)+1+(++a));
System.out.println(((a)++)+(++a)+(++a));
a=3;

// 불가 System.out.println(a+=1);
System.out.println("-------------------------");
String msg1;
msg1="Hello";
String msg2;
msg2="Java";
String msg3=msg1+msg2;
System.out.println(msg1+" "+msg2);
System.out.println(msg3);
System.out.println(msg2+2);
System.out.println(2018+"년"+8+"월"+31+"일");
System.out.println(2000+18+"년"+8+"월"+31+"일");
System.out.println(2000+18+"년"+(8+1)+"월"+31+"일");
}

}












