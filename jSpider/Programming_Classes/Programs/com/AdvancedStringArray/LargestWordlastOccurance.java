package advancedArrayString;

public class LargestWordlastOccurance {

	public static void main(String[] args) {
		String s="Ram was a boy is a man";
		
		String[] arr=s.split(" ");
		String max= arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].length()>=max.length()) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
	}
}
