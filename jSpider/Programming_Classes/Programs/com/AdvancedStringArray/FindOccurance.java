package advancedArrayString;

public class FindOccurance {
	
	static int findMax(int[] arr , int k) {
		int max= 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int[] temp= new int[max+1];
		for(int ele: arr) {
			temp[ele]++;
			
			if(temp[ele]==k) {
				return ele;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int [] arr= {7,4,5,4,1};
		int k=2;
		System.out.println(findMax(arr, k));
	}

}
