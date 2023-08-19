package com;


public class CodeTest1Q3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//to check prime number
		
		int n=5, c=0;
		
		for(int i=1; i<=n; i++) {
			
			if (n%i==0) {
				
				c++;	
		}
			
		}
		if (c==2) {
			System.out.println("Prime number");
			
		}
		else {
			System.out.println("Not prime number");
		}
		 

	}

}
