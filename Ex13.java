class Ex13{

public static void main(String[] args){
	//문자형
	//char (2byte=16bit=2^16=65536)
	char ch1;
	ch1='한';

	System.out.println(ch1+":"+(int)ch1);
	char ch2;
	ch2='\uAC00';
	System.out.println(ch2+":"+(int)ch2);
	char ch3;
	ch3='\n';
	System.out.println(ch3+":"+(int)ch3);
	char ch4;
	ch4=(char)97;
	System.out.println(ch4);
}

}