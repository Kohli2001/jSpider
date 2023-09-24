package regularExpression;

import java.util.regex.*;

public class StartingWithAlpha {
	public static void main(String[] args) {
		String s1 = "abDGKAM12627%%$6";
		
		Pattern p = Pattern.compile("[a-z , A-Z].*");
		Matcher m = p.matcher(s1);
		System.out.println(m.matches());
		
	}

}
