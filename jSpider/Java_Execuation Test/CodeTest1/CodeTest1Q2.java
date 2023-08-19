package com;

public class CodeTest1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  n = 6, c=0;
		
		for(int i=1 ; i<=n; i++) {
			if (n==i*i) {
				c++;
				
			}
			
		}
		if (c==1) {
			System.out.println("Perfect square");
			
		}
		else {
			System.out.println("Not perfect Square");
		}

	}

}
