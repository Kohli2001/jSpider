package advancedArrayString;

public class CountOccuranceOfWords {
	public static void main(String[] args) {
	String str= "hello hii hello";
	String[] arr= str.split(" ");
	String[] arr2=str.split(" ");
	for(int i=0; i<arr.length; i++) {
		int c=0;
		for(int j=0; j<arr2.length; j++) {
			if(arr[i].equals(arr2[j])) {
				c++;
				arr2[j]="";
			}
		}
		
		if(c>0) {
			System.out.println(arr[i]+"-" +c);
		}	
	}
  }

 }
