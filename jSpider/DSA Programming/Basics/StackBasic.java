package org.dsa.basics;

import java.util.Iterator;

import java.util.Stack;

public class StackBasic {
	
	static int[] stack;
	static int top;
	
	static void createStack(int size) {
		stack=new int[size];
		top=-1;
		System.out.println("Stack has been created with size :"+size);
	}
	static void push(int ele) {
		if(top==stack.length) {
			System.out.println("Stack Overflow......");
			
		}
		else {
			top++;
			stack[top]=ele;
			System.out.println(ele+ " added");
		}
	}
	
	static void display() {
		if (top==-1) {
			System.out.println("Stack is Empty");
			
		}
		else {
			for(int i=top; i>=0; i--) {
				System.out.println(stack[i]);
			}
		}
	}
	static void pop() {
		if(top==-1) {
			System.out.println("StackUnderflow.....");
		}
		else {
			stack[top]=0;
			top--;
		}
	}
	static void clear() {
		if(top==-1) {
			System.out.println("StackUnderFlow");
		}
		else {
			for(int i=top; i>=0; i--) {
				stack[i]=0;
				top--;
			}
		}
	}
	
	static void isEmpty() {
		if(top==-1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	static void isFull() {
		if(top==stack.length-1) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
	}
//	static void length() {
//		if() {
//			
//		}
//	}
	public static void main(String[] args) {
		createStack(5);
		display();
		push(10);
		push(20);
		push(30);
		clear();
//		pop();
//		push(50);
//		push(100);
		display();
		isEmpty();
		
		
	}

}
