package advancedArrayString;

public class LeftRotationArray {
	
	static void leftSwap(int[] arr) {
		int temp=arr[arr[0]];
		for(int i=0; i<arr.length-2; i++) {
			arr[i]=arr[i+1];
		}
		arr[0]=temp;
	}
	public static void main(String[] args) {
		
		int[] arr= {12,20,30};
		int r=1;
		for(int i=1; i<=r; i++) {
			leftSwap(arr);
		}
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
	}

}
