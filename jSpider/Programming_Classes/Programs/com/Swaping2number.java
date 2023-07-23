package com;

public class Swaping2number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//different way of swiping 
		
		int a = 5 , b = 10; 
		System.out.println("Before swaping " +a +" "+b);
		
		//logic1
//		
//		int t ;
//		
//				t= a;
//				a=b;
//				b=t;
		
		
		// logic 2 
				
//				a = a+b ;
//				b = a-b;
//				a=a-b;
//		
				
		//logic3  >>>> if a or b not equal to zero  
//				a =a*b;
//				b=a/b;
//				a=a/b;
		
		//logic 4 >>> using simple statements 
		 
		          b = a+b-(a=b);
		 
				
			
		System.out.println("after swaping " +a +" "+b);

	}

}
