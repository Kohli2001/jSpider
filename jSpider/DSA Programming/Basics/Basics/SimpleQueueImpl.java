package org.dsa.basics;

import java.util.Scanner;

public class SimpleQueueImpl {
	
	static int[] Queue;
	static int front;
	static int rear;
	
	//creating a queue with user define size
	static void createQueue(int n) {
		Queue = new int[n];
		System.out.println("Queue is created with size " +n);
	}
	//creating a method for inserting
	static void enQueue(int ele) {
		if(Queue.length==rear) {
			System.out.println("Queue is full..!");
		}
		else {
			Queue[rear]=ele;
			rear++;
			System.out.println(+ele +" element inserted ");
		}
	}
	//this method will Display the Queue elements
	static void displayQueue() {
		if(rear==0) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i=front; i<rear; i++) {
				System.out.print(Queue[i]+ " ");
			}
			System.out.println();
		}
	}
	//This method is used to remove one element at a time
	static void deQueue() {
		if(rear==0) {
			System.err.println("The Queue is Empty");
		}
		else {
			for(int i=front; i<rear-1; i++) {
				Queue[i]=Queue[i+1];
				
			}
			System.err.println(Queue[front]+ " Got deleted from queue");
			rear--;
			Queue[rear]=0;
		}
		

	}
	static void isEmpty() {
		if(rear==0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	static void isFull() {
		if(rear==Queue.length) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====Welcome to Queue World=======");
		System.out.println("Choose Your operations\n1.create Queue\n2.Enqueue\n3.Display\n4.Dequeue\n5.Exit");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the size to create");
			int size = sc.nextInt();
			createQueue(size);
			break;
		case 2:
			System.out.println("Enter the element to Insert");
			int ele = sc.nextInt();
			enQueue(ele);
			break;
		case 3:
			displayQueue();
			break;
		case 4:
			deQueue();
			break;
		case 5:
			System.exit(0);
			break;
			
		default:
			System.out.println("Invali input");
			break;
		}
		
		
		
	}

}
