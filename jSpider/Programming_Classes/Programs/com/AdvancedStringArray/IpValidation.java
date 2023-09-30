package advancedArrayString;

public class IpValidation {
	public static void main(String[] args) {
		String ip= "122.123.67.78";
		String[] arr= ip.split("[.]");
		int[] arr1= new int[arr.length];
		if(arr.length==4) {
			for(int i=0; i<4; i++) {
				arr1[i]=Integer.parseInt(arr[i]);
			}
		}
		boolean b =true;;
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]>=0 && arr1[i]<=255) {
				b=true;
			}
			else {
				b=false;
				break;
			}
		}
		System.out.println(b?"Valid ":"invalid");
		
	}

}
