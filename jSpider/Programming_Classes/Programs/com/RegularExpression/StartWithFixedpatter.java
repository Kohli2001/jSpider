package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartWithFixedpatter {
	public static void main(String[] args) {
		
//starts with three char of alpha  and then four char of num
		String s= "ab&9693";
		Pattern p= Pattern.compile("[a-z , A-Z]{3}[0-9]{4}.*");
		Matcher m = p.matcher(s);
		System.out.println(m.matches());
		
	}

}
