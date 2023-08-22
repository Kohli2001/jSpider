package com;

public class loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//count the no of factors of guven number;
		
		int n = 3 ,  count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
			
			
		}
		
		System.out.println(count);
	}

}
