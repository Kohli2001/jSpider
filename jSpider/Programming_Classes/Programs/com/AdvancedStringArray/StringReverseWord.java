package advancedArrayString;

public class StringReverseWord {
	
	public static void main(String[] args) {
		
		String s = "hell ohi welcome bye iditos awesome";
		
		String[] arr = s.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			String s1="";
			if(i%2==1) {
				
				for(int j=0; j<arr[i].length(); j++) {
					s1=s1+arr[i].charAt(j);
					
				}
				arr[i]=s1;
				
			}
		}
		System.out.println(s);
	}

}
