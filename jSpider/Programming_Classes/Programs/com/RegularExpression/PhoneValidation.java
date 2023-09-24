package regularExpression;

import java.util.regex.*;

public class PhoneValidation {
	
	public static void main(String[] args) {
		String s = "9693631293";
		
		Pattern p= Pattern.compile("[6-9]{1}[0-9]{9}");
		Matcher m = p.matcher(s);
		System.out.println(m.matches());
		
	}

}
