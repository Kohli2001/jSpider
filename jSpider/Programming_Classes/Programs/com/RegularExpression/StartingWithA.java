package regularExpression;

import java.util.regex.*;

public class StartingWithA {
	public static void main(String[] args) {
		
		String s1 = "Apple";
		
		Pattern p= Pattern.compile("A.*");
		Matcher m= p.matcher(s1);
		boolean ans = m.matches();
		System.out.println(ans);
	}

}
