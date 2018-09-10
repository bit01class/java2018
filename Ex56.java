/*
1+(1/2)+(2/3)+(3/4)+...(999999999/100000000)=?;
1+(1-1/2)+(1-1/3)+(1-1/4)+...(1-1/100000000)=?;
*/
class Ex56{

public static void main(String[] args){
	double sum=1.0;
	for(int i=1; i<100000000; i++){
		//sum+=i*1.0/(i+1);
		sum=sum+(i*100.0/(i+1)/100);
	}
	System.out.println(sum);
	System.out.println("-----------------------------------");
	sum=1.0;
	for(int i=1; i<100000000; i++){
		sum=sum+(1-1.0/(i+1));
	}
	System.out.println(sum);

}


}