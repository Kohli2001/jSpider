package org.dsa.basics;

public class StringSeqFreqWithChar {
	
	static String countSeqFreq(String s) {
		s=s+" ";
		int c=1;
		String ans="";
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++;
			}
			else {
				ans=ans+s.charAt(i)+c;
				
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		System.out.println(countSeqFreq("aabcc"));
	}

}
