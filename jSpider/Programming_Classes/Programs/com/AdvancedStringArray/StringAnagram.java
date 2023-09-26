package advancedArrayString;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "elloh";
		int c =0;
		
		char []c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		String s3="";
		String S4="";
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(c1.length==c2.length) {
			for(int i=0; i<c1.length; i++) {
				s3=s3+c1[i];
				S4=S4+c2[i];
		}
		
		}
//		
//		for(int i=0; i<c1.length; i++) {
//			s3=s3+c1[i];
//		}
//		for(int j=0; j<c2.length; j++) {
//			S4=S4+c2[j];
//		}
		if(s3.equals(S4)) {
			System.out.println("String Anagram");
		}
		else {
			System.out.println("Not String Anagram");
		}
		
	}

}
