package org.dsa.basics;


public class LinkedListImpl {
	
	Node head;
	void insert(int ele) {
		Node n= new Node(ele);
		if(head==null) {
			head=n;
		}
		else {
			Node temp=head;
			while(temp.nextNode!=null) {
				temp=temp.nextNode;
			}
			temp.nextNode=n;
			
		}
	}
	
	void display() {
			if(head==null) {
				System.out.println("node is empty");
				
			}
			else {
				Node temp = head;
				while(temp.nextNode!=null) {
					System.out.println(temp.data);
					temp=temp.nextNode;
				}
				System.out.println(temp.data);
			
			}
		
	}
	void search(int ele) {
		
		int c=0;
		if(head==null) {
			System.out.println("Node is empty");
		}
		else {
			Node temp= head;
			while(temp.nextNode!=null) {
				if(ele==temp.data) {
					c++;
				}
				temp=temp.nextNode;
				c++;
			}
			System.out.println(c>=1?"Yes found":"Not found");
		}
		
	}
	void insertFront(int ele) {
		Node n= new Node(ele);
		
		if(head==null) {
			head=n;
		}
		else {
			n.nextNode=head;
			head=n;
			System.out.println(ele+ " Had been inserted..!");
		}
	}
	
	void delete() {
		if(head==null) {
			System.out.println("Node is empty...");
		}
		else if (head.nextNode==null) {
			System.out.println(head.data +"deleted");
			head=null;
		}
		else {
			Node temp=head;
			while(temp.nextNode.nextNode!=null) {
				temp = temp.nextNode;
			}
			System.out.println(temp.nextNode.data+ " has been deleted");
			temp.nextNode=null;
			
		}
	}
	public static void main(String[] args) {
		LinkedListImpl l1= new LinkedListImpl();
		l1.insert(10);
		l1.insert(30);
		l1.insertFront(5);
		l1.insert(50);
//		l1.search(50);
		l1.insertFront(100);
//		l1.insert(500);
		l1.display();
//		l1.delete();
		
		
	}
}
