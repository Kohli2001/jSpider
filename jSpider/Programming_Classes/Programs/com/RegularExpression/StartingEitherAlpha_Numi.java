package regularExpression;

import java.util.regex.*;

public class StartingEitherAlpha_Numi {
	public static void main(String[] args) {
		
		String s = "57ab&1413651kamls&%^^";
		Pattern p = Pattern.compile("[a-z , A-Z, 0-9].*");
		Matcher m = p.matcher(s);
		System.out.println(m.matches());
	}

}
