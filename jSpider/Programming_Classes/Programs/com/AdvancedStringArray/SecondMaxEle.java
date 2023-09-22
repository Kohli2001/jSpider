package advancedArrayString;

public class SecondMaxEle {
	static void sort(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {876,353,9089,24,12};
		sort(arr);
	 for (int ele : arr) {
		 System.out.print(ele+" ");
		
	}
	 System.out.println();
	 System.out.println("2nd max ele " +arr[arr.length-2]);
	 System.out.println("1st min ele " +arr[0]);
	 System.out.println("3rd max ele " +arr[arr.length-3]);
	}

}
