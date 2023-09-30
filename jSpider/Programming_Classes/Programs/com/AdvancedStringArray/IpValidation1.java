package advancedArrayString;

public class IpValidation1 {
	public static void main(String[] args) {
		
		String ip="122.663.67.78";
		String[] arr=ip.split("[.]");
		boolean flag=true;
		
		for(String ele:arr) {
			int n=Integer.parseInt(ele);
			if(n<0 || n>255) {
				flag=false;
				break;
			}
		}
		if(flag==true && arr.length==4) {
			System.out.println("Valid ip address");
		}
		else {
			System.out.println("invalid ip address");
		}
	}
	


}
