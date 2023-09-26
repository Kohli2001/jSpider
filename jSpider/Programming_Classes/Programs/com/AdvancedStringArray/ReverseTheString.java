package advancedArrayString;

public class ReverseTheString {
	public static void main(String[] args) {
		String s1= "Hello hi welcome";
		
		String [] arr = s1.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
