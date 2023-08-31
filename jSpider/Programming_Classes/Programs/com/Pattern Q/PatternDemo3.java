package com;

public class PatternDemo3 {
	public static void main(String[] args) {
		int  n=5;
		for(int i=1; i<=n; i++) {
			int c=0;
			for(int j=1; j<=n; j++) {
				if(i+j%5==0) {
					continue;
				}
				c++;
			}
			System.out.println(c);
		}
	}

}
