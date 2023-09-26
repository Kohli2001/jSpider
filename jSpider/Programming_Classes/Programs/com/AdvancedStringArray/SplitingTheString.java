package advancedArrayString;

public class SplitingTheString {
	public static void main(String[] args) {
		
		String s1 = "Hello@ hi b@ye wel@come";
		
		String s2 = "kamleshkumarkohli@gmail.com";
		
		String[] arr = s1.split("@");
		String[] arr1= s2.split("[.]");
		
		for (String ele: arr1) {
			System.out.print(ele+" ");
			
		}
		for (String ele : arr) {
			System.out.print(ele+" ");
			
		}
	}

}
