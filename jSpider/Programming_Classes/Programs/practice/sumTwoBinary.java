package practice;

public class sumTwoBinary {
	
	// add two binary  values using functions 
	
	public static void addBinary(String b1 , String b2) {
		int n1 = Integer.parseInt(b1, 2);
		int n2 = Integer.parseInt(b2, 2);
		
		int n3 = n1+n2;
		
		System.out.println("Sum of two binary value = "+Integer.toBinaryString(n3));
		
	}
	
	public static void main(String[] args) {
		addBinary("10" , "11");
		
	}
	
	

}
