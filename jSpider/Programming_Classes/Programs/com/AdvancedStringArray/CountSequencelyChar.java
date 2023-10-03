package advancedArrayString;

public class CountSequencelyChar {
	public static void main(String[] args) {
	String s="AAAAAABBBLBBCCCAAAFFFEEEKKKK";
	s=s+" ";
	int c=1;
	for(int i=0; i<s.length()-1; i++) {
		char c1= s.charAt(i);
		char c2=s.charAt(i+1);
		
		if(c1==c2) {
			c++;
		}
		else {
			System.out.print(s.charAt(i)+""+c);
			c=1;
		}
		
	}
	}
}
