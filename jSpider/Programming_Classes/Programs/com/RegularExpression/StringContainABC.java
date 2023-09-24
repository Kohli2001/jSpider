package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContainABC {
	public static void main(String[] args) {
		String s1 = "kamleshabc";
		
		Pattern p= Pattern.compile(".*abc.*");
		Matcher m= p.matcher(s1);
		System.out.println(m.matches());
	}

}
