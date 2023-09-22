package advancedArrayString;

public class SortingString {
	
	static void sort(char [] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					char temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		String s = "hello";
		char[] arr =s.toCharArray();
		sort(arr);
		for (char ele : arr) {
			System.out.print(ele);
		}
	}

}
