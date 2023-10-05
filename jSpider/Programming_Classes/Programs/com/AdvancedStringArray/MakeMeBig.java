package advancedArrayString;

import java.util.Arrays;

public class MakeMeBig {
	
	
	
	
	static void sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}

	}
	public static void main(String[] args) {
		int n=63856; int m=n;
		String s= n+""; String s1="";
		char [] arr=s.toCharArray();
		Arrays.sort(arr);
		for(int  i=arr.length-1; i>=0; i--) {
			   
			
		}
//		String s1=new String(arr);
		
		System.out.println(Integer.parseInt(s1));
//		int c=0;
//		while(n!=0) {
//			int r=n%10;
//			c++;
//			n=n/10;
//		}
//		int [] arr= new int[c];
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=m%10;
//			m=m/10;
//		}
//		sort(arr);
//		for(int ele: arr) {
//			System.out.print(ele+" ");
//		}
	}
}
