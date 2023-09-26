package advancedArrayString;

public class FindSumOfNumString {
	public static void main(String[] args) {
		//find the total sum of the number present int the given string  
		//i/p----> 400+200+100
		//o/p----> 700
		String s ="hello 400 hi 200 zindgi 100";
		//String[] arr= s.split("[^0-9]+");
		String [] arr = s.split(" ");
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i].charAt(0)>='0' && arr[i].charAt(0)<='9'){
				//System.out.println(arr[i]);
				sum=sum+Integer.parseInt(arr[i]);
			}	
		}
		System.out.println(sum);
		
	}

}
