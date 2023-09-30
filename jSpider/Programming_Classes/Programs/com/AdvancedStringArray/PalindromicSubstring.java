package advancedArrayString;

public class PalindromicSubstring {
	static void  isPalindrome(String s) {
		s=s.toLowerCase();
		String s1="";
		for(int i=s.length()-1; i>=0; i--) {
			s1=s1+s.charAt(i);
				
		}
		if(s.equals(s1)) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		String s="abdbabdba";
		for(int i=0; i<s.length(); i++) {
			String s2=""+s.charAt(i);
			for(int j=i+1; j<s.length(); j++) {
				s2=s2+s.charAt(j);
				isPalindrome(s2);
				
			}
		}
		
		
	}

}
