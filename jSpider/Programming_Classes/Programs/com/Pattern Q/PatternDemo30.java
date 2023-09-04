package com;

public class PatternDemo30 {
	public static void main(String[] args) {
		int n= 7;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(i+j>n+1?"* ":"");
			}
			System.out.println();
		}
	}
}
