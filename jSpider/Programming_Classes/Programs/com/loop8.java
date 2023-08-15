package com;

public class loop8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 8 , count=0;
		for(int i =1; i<=n; i ++) {
			if(n==i*i) {
				count++;
			}
			
		}
		if(count==1) {
			System.out.println("It Is perfect sq number");
		}
		else {
			System.out.println("No its not perfect sq number");
		}
	}

}
