class Ex45{

public static void main(String[] args){
	int a,b,c;
	a=4;b=9;c=1;
	System.out.println(func01(a,b,c));
}

public static String func01(int a,int b, int c){
	String msg="";
	if(a<b && a<c){ 
		msg+=a;
		msg+=" < ";
		if(b<c){
			msg+=b+" < "+c;
		}else{
			msg+=c+" < "+b;
		}
	}else if(b<a && b<c){ 
		msg+=b;
		msg+=" < ";
		if(a<c){
			msg+=a+" < "+c;
		}else{
			msg+=c+" < "+a;
		}
	}else{ 
		msg+=c;
		msg+=" < ";
		if(b<a){
			msg+=b+" < "+a;
		}else{
			msg+=a+" < "+b;
		}
	}
	return msg;
}

}