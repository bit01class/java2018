package com.bit.day15;

class MyArray{
	private Object[] target;
	int leng=10;
	
	public MyArray() {
		target=new Object[0];
	}
	
	//입력
	public void add(Object a){
		Object[] old=target;
		target=new Object[target.length+1];
		for(int i=0; i<old.length; i++){
			target[i]=old[i];
		}
		target[target.length-1]=a;
	}
	
	// 사이즈
	public int size(){
		return target.length;
	}
	
	//출력
	public Object get(int idx){
		return target[idx];
	}
	// 지우기
	public void remove(int idx){
		Object[] old=target;
		target=new Object[old.length-1];
		System.arraycopy(old, 0, target, 0, idx);
		int leng=old.length-(idx+1);
		if(leng>0){
			System.arraycopy(old, idx+1, target, idx, leng);
		}
	}
	
}

public class Ex06 {
	// 컬렉션 프레임워크(자료구조를 구현한 프레임워크)
	// ArrayList(배열을 이용한 list구조 구현체)
	
	public static void main(String[] args) {
//		MyArray arr1=new MyArray();
		java.util.ArrayList arr1 = new java.util.ArrayList();
		arr1.add(new int[]{90,90,90});
		arr1.add(new int[]{80,80,80});
		arr1.add(new int[]{70,70,70});
		arr1.add(new int[]{60,60,60});
		
		arr1.remove(2);
		
		for(int i=0; i<arr1.size(); i++){
			int[] obj=(int[]) arr1.get(i);
			for(int j=0; j<obj.length; j++){
				System.out.print(obj[j]+" ");
			}
			System.out.println();
		}
		
//		arr1.add(1234);
//		arr1.add(3.14);
//		arr1.add("문자열");
//		arr1.add(false);
//		arr1.add('$');
//		
//		arr1.remove(3);
//		
//		for(int i=0; i<arr1.size(); i++){
//			System.out.println(arr1.get(i));
//		}
		
	}

}




















