package regularExpression;
import java.util.regex.*;

public class EndingWithA {
	public static void main(String[] args) {
		String s1 = "applA";
		s1=s1.toLowerCase();
		Pattern p = Pattern.compile(".*a");
		Matcher m = p.matcher(s1);
		System.out.println(m.matches());
		
	}

}
