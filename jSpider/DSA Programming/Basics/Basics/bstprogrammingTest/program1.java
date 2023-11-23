package org.dsa.basics.bstprogrammingTest;

public class program1 {
	
	public static void main(String[] args) {
		String s1= "alskjdhd25364@";
		s1=s1.toLowerCase();
		int alpha=0, num=0 , non=0;
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			if(c>='a' && c<='z') {
				alpha++;
				
			}
			else if (c>='0' && c<='9') {
				num++;
				
			}
			else {
				non++;
			}
		}
		if(alpha>1 && num>1 && non!=1) {
			System.out.println("String is contains only aplha and numeric");
		}
		else {
			System.out.println("no its containing other that also ");
		}
	}

}
