package regularExpression;

import java.util.regex.*;

public class SecondCharB {
	public static void main(String[] args) {
		String s1 = "BAcccccccccccc";
		Pattern p= Pattern.compile(".B.*");
		Matcher m = p.matcher(s1);
		System.out.println(m.matches());
	}

}
