package advancedArrayString;

public class NumToWord {
	public static void main(String[] args) {
		int n=1768;
		
String [] arr={"zero","one","two","three","three","four","five","six","seven","eight","nine"};
	String s="";	
while(n!=0) {
	s= arr[n%10]+s;
	n=n/10;
}
System.out.println(s);
		
	}

}
