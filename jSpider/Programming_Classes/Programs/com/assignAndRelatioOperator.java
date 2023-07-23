package com;

public class assignAndRelatioOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a +=10; // Error : complitions error a value not inilized
		
		int a = 8;
		a +=2;
		System.out.println(a);
		
		a*=4;
		System.out.println(a);
		
		a/=10;
		System.out.println(a);
		
		
		
		// using char values
		
		char charater = 'A';
		charater+=1;
		System.out.println(charater);
		
		char c ='A';
		c-=1;
		System.out.println(c);
		
		int n = 'A';
		System.out.println(n); // printed the ASCII value of A
		
		n+=2;
		System.out.println(n);  // ASCII value of A = 65 + 2 = 67
		
		
		
		

	}

}
