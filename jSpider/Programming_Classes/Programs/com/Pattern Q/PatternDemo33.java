package com;

public class PatternDemo33 {
	public static void main(String[] args) {
		int n= 9;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(i+j>=n+1?"* ":" ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
						System.out.print(j>i?"* ":" ");
			}
			System.out.println();
		}
	}
}
