package com;


public class PatternDemo10 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print((j+1)%2 +" ");
			}
			System.out.println();
		}
	}

}

/*0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 */
