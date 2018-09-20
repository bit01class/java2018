package com.bit.day11;

/*
 * "Java Web"
 * "Java Web Spring"
 * "Java Web Spring db"
 * 
 * Q1. 대문자의 갯수를 구하시오 
 * 
 * Q2. 대문자를 소문자로 변환하시오
 * 
 * Q3. 띄어쓰기를 기준으로 
 * 		str[0]="Java"
 * 		str[1]="Web"
 * 		str[2]="Spring"를 만드시오
 * 
 * Q4. 띄어쓰기를 제거하시오
 * 
 * 
*/
public class Ex09 {

	public static void main(String[] args) {
		 String target="Java Web Spring Database HTML";
		 int cnt=0;
		 
		 for(int i=0; i<target.length(); i++){
			 char ch=target.charAt(i);
			 if(ch>='A'&& ch<='Z'){
				 cnt++;
			 }
		 }
		 System.out.println("\""+target+"\"의 대문자 갯수는 "+cnt);
		 System.out.println("------------------------------------------");
		 cnt=0;
		 int gap='a'-'A';
		 char[] chs1=target.toCharArray();
		 for(int i=0; i<chs1.length; i++){
			 char ch=chs1[i];
//			 if(ch>='A'&& ch<='Z'){
//				 //cnt++;
//				 chs1[i]+=gap;
//				 }
			 if(ch>='a'&& ch<='z'){
				 //cnt++;
				 chs1[i]-=gap;
			 }
		 }
		 String result=new String(chs1);
		 System.out.println(result);
		 System.out.println("------------------------------------------");
		 cnt=0;
		 int start=0;
		 int idx=0;
		 char[] chs=target.toCharArray();
		 for(int i=0; i<target.length(); i++){
			 if(target.charAt(i)==' '){cnt++;}
		 }
		 String[] box=new String[cnt+1];
		 cnt=0;
		 for(int i=0; i<target.length(); i++){
			 if(target.charAt(i)==' '){
				 //chs0~chsi
				 char[] dest=new char[i-start+1];
				 System.arraycopy(chs, start, dest, 0, dest.length);
				 box[cnt]=new String(dest);
				 cnt++;
				 start=i+1;
			 }else if(i==target.length()-1){
				 char[] dest=new char[i-start+1];
				 System.arraycopy(chs, start, dest, 0, dest.length);
				 box[cnt]=new String(dest);
			 }
		 }
		 System.out.println("box size:"+box.length);
		 for(int i=0; i<box.length; i++){
			 System.out.println(box[i]);
		 }
	}

}





















