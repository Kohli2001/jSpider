package advancedArrayString;

public class StringToInteger {
	public static void main(String[] args) {
		
		String s= "14546287";
		int n=0;
		for(int i=0; i<s.length(); i++) {
			n=(n*10)+(s.charAt(i)-48);
			
		}
		System.out.println(n);
		
		//using predefined function
		System.out.println(Integer.parseInt(s));
			 
	}

}
