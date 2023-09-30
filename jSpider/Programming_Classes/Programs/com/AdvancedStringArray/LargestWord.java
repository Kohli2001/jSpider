package advancedArrayString;

public class LargestWord {

	
	//write a java program to print a biggest word in the given string 	
	//if 2 or more word is having the maximum length print the first occurance
	
		public static void main(String[] args) {
			String s="Ram is boy";
			
			String [] arr= s.split(" ");
			String  temp =  arr[0];
			for(int i=0; i<arr.length; i++) {
				if(temp.length()<arr[i].length()) {
					temp=arr[i];
				}
			}
			System.out.println(temp);
			
		
	}
}
