package regularExpression;

import java.util.regex.*;

public class EmailValidation {
	public static void main(String[] args) {
		String email = "kamleshkumarkohli7@gmail.com";
		
		Pattern p = Pattern.compile("[a-z, 0-9].*[@gmail.com]");
		Matcher m= p.matcher(email);
		System.out.println(m.matches());
	}

}
