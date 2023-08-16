package com;


public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//printing first n natural number

		int  n=10 , sum=0;
		while(n>=1) {
			sum+=n;
			n--;
			
		}
		System.out.println(sum);
		
		
		
		
		//printing first n natural number with 2nd methods 
		int  num =10 , Totalsum=0, i=1;
		
		while(num>=i) {
			Totalsum+=i;
			i++;
			
		}
		System.out.println(Totalsum);
	}

}
