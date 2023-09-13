package com;

public class StringDemo9 {
	public static void main(String[] args) {
		//str="hj56432gh534"
		//find out the sum of all numeric 
		//which all present in the given String
		String s1 = "hj56432gh534";
		int sum=0;
		
		for(int i=0; i<s1.length(); i++) {
			
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
				sum=sum+(s1.charAt(i)-48);
			}
			
		}
		System.out.println(sum);
		
		
	}

}
