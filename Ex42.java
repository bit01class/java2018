class Ex42{

	public static void main(String[] args){
		// �л� �������� ���α׷�(ver 0.0.3)
		String bar="----------------------------------------------";
		int kor, eng, math;

		System.out.println(bar);
		System.out.println("�л� �������� ���α׷�(ver 0.0.3)");
		System.out.println(bar);
		kor=95;
		eng=89;
		math=78;
		Ex42 me = new Ex42();
		System.out.println("����\t����\t����\t�հ�\t���\t����");
		System.out.println(bar);
		System.out.print(kor);
		System.out.print('\t');
		System.out.print(eng);
		System.out.print('\t');
		System.out.print(math);
		System.out.print('\t');
		System.out.print(me.sum(kor,eng,math));
		System.out.print('\t');
		System.out.print(me.avg(kor,eng,math));
		System.out.print('\t');
		System.out.println(me.grade(kor,eng,math));		

	} // main end
	
	public int sum(int a, int b, int c){
		return a+b+c;
	}
	
	public double avg(int a, int b){
		return a*100/b/100.0;
	}

	public double avg(int a, int b, int c){
		int tot=sum(a,b,c);
		return tot*100/3/100.0;
	}

	public char grade(int a, int b, int c){
		double avg=avg(a,b,c);
		return grade(avg);
	}

	public char grade(double a){
		char ch='F';
		switch((int)a/10){
			case 10: case 9:
				ch='A'; break;
			case 8:
				ch='B'; break;
			case 7:
				ch='C'; break;
			case 6:
				ch='D'; break;
		}
		return ch;
	}


} // class end











