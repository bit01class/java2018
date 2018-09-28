package com.bit.day15;

class Node{
	int val;
	Node node;
}

class MyLink{
	Node start;
	int cnt;
	
	public int size(){
		return cnt;
	}
	
	public int get(int index){
		int su=0;
		Node temp=start;
		for(int i=0; i<index; i++){
			temp=temp.node;
		}
		su=temp.val;
		// 0
//		su=start.val;
		// 1
//		su=start.node.val;
		// 2
//		su=start.node.node.val;
		return su;
	}
	
	public void add(int a){
		if(cnt==0){
			start= new Node();
			start.val=a;
			cnt++;
		}else{
			Node temp=start;
			while(true){
				if(temp.node==null){
					break;
				}
				temp=temp.node;
			}
			temp.node=new Node();
			temp.node.val=a;
			cnt++;
			
//			start.node=new Node();
//			start.node.val=a;
//			cnt++;
//			
//			start.node.node=new Node();
//			start.node.node.val=a;
//			cnt++;
//			
//			start.node.node.node=new Node();
//			start.node.node.node.val=a;
//			cnt++;
		}
	}
}

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLink list= new MyLink();
		
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		list.add(3333);
		list.add(2222);
		list.add(1111);
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}













