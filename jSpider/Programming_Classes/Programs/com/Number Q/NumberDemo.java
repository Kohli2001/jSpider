package com;

public class NumberDemo {
	
	
	
	public static void main(String[] args) {
		int n=1208 , c=0 ,m=n, sum=0 ;
			while(n!=0) {
				
				n=n/10;
				c++;
			}
			if(c%2==0) {
				int pow = (int)Math.pow(10, c/2);
				sum=(m/pow)+(m%pow);
			}
			System.out.println(sum*sum==m?"Tech number":"Not Tech number");
			
			
			
		}
		 
		
	}


