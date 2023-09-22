package advancedArrayString;

public class StringToArray {

	public static void main(String[] args) {
		String s="Hello";
//		char [] arr = s.toCharArray();
//		for(int i=0; i<s.length(); i++) {
//			arr[i]=s.charAt(i);
//		}
//		for (char ele : arr) {
//			System.out.println(ele);
//			
//		}

		//simplest way using function 
		char [] arr = s.toCharArray();
		for (char c : arr) {
			System.out.println(c);
		}
		
	}
}
