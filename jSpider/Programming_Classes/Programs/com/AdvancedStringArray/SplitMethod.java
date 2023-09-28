package advancedArrayString;

public class SplitMethod {
	public static void main(String[] args) {
		String s1 = "hello hi bye";
		int space=0;	
		//counting the total spaces
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)==' ') {
				space++;
			}
		}		
		String [] arr = new String[space+1];
		int k =0;  String temp="";
		//creating logic to spliting the words 
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)==' ') {
				arr[k]=temp;
				k++;
//				System.out.println(temp);
				temp="";
			}
			else {
				temp=temp+s1.charAt(i);
			}
		}
		
		arr[k]=temp; //adding this line to print last word of string array
		for(String ele: arr) {
			System.out.println(ele);
		}
	}

}
