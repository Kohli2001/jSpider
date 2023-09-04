package com;

public class PatternDemo34 {
	public static void main(String[] args) {
		int n=7;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(i==1||j==1||i==n||j==n||(i==n/2+1&&j==n/2+1)?"* ":"  ");
				
			}
			System.out.println();
		}
	}

}
