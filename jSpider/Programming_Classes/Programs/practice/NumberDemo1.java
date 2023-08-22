package practice;

public class NumberDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1451 ,r=0,c=0,sum=0;
		while (n!=0) {
			
			r=n%10;
			sum+=r;
			n=n/10;
			}
			for(int i=1; i<=sum; i++) {
				
				if(sum%i==0) {
					c++;
				}
			}		
			
		
		if (c==2) {
			System.out.println("prime number " +sum);
			
		}
		else {
			System.out.println("Not prime " +sum);
		}
	}

}
