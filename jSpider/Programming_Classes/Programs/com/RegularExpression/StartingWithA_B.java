package regularExpression;

import java.util.regex.*;

public class StartingWithA_B {
	public static void main(String[] args) {
	
		String s1 = "appleb";
		Pattern  p = Pattern.compile("a.*b");
		Matcher m = p.matcher(s1);
		System.out.println(m.matches());
	}

}
