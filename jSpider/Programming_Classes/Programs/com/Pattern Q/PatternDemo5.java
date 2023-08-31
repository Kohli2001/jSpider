package com;

public class PatternDemo5 {
public static void main(String[] args) {
	

	int n=3;   // int c=0;
	for(int i=1; i<=n; i++) {
		for(int  j=1; j<=n; j++) {
			if ((i+j)%2==0) {
				System.out.println(j);
			}
			else {
				break;
			}
				
			}
			
}
	}
}