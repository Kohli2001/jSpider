package advancedArrayString;

public class StringAnagram2 {
	
	static String sort(char [] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		return new String(arr);
	}
	public static void main(String[] args) {
		String s1= "apple";
		String s2="ppael";
		
		char[] arr1= s1.toCharArray();
		char[] arr2= s2.toCharArray();
		
		if(sort(arr1).equals(sort(arr2))) {
			System.out.println("String Anagram");
		}
		else {
			System.out.println("NOt String Anagram");
		}
		
	}

}
