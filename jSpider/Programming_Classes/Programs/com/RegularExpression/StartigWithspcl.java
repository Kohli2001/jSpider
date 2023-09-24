package regularExpression;

import java.util.regex.*;

public class StartigWithspcl {
	public static void main(String[] args) {
		String s = ".ahdghgsfhj";
		Pattern p = Pattern.compile("[^a-z , ^A-Z , ^0-9].*");
		Matcher m = p.matcher(s);
		System.out.println(m.matches());
	}

}
