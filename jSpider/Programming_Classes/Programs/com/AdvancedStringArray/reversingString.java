package advancedArrayString;

public class reversingString {
	
	//reversing the Stringword at even position 
	
	
	static String reverse(String s) {
		String res="";
		for(int i=s.length()-1; i>=0; i--) {
			res=res+s.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		String s="hell ohi welcome bye iditos awesome";
		
		String[] arr = s.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			if(i%2==1) {
				System.out.print(reverse(arr[i]+" "));
			}
			else {
				System.out.print(arr[i]+ " ");
			}
		}
	}

}
