package advancedArrayString;

public class CompanyString {
	public static void main(String[] args) {
		
		String s1= "aabdaddceefgzzd";
		
		int [] arr= new int[126];
		
		for(int i=0; i<s1.length(); i++) {
			arr[s1.charAt(i)]++;

		}
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>0) {
				System.out.println((char)i+"-"+arr[i]);
			}
		}
	}
}
