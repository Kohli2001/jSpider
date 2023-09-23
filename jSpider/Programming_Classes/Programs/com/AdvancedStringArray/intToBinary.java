package advancedArrayString;

public class intToBinary {
	
	public static void main(String[] args) {
		int n = 9;
		String res="";
		while(n!=0) {
			res=n%2+res;
			n=n/2;
		}
		
		System.out.println(res);
	}

}
