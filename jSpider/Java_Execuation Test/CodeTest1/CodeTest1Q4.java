package com;

public class CodeTest1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 2 , c=0 ,sum=0;
		
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println("Sum: " +sum);
			
		for(int i=1; i<=sum; i++) {
			
			if (sum%i==0) {
				
				c++;
				
			}
		}
		
		if (c==2) {
			
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}
		

	}

}
