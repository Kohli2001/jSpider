package com;

public class PatternDemo4 {
	public static void main(String[] args) {

		int n=5; int c=0;
		for(int i=1; i<=n; i++) {
			for(int  j=1; j<=n; j++) {
				System.out.println("Hello");
				c++;
			}
			if(i%2==0) {
				i+=1;
			}
		}
		System.out.println(c);
	}

}
