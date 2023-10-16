package learningExceptions;

public class Demo1 {
	public static void main(String[] args) {
		
		int x=100;
		int y=5;
		
		int z=0;
		
		System.out.println("Dividing "+x+" by "+y);
		int res= x/y;
		System.out.println("Result: "+res);
		
		try {
			
		
		System.out.println("Dividing "+x+" by "+z);
		int res1= x/z;
		System.out.println("Results:"+res1);
		
		}
		catch(ArithmeticException e) {
			System.out.println("can not divide a number by Zero");
//			System.out.println(e);
		}
	}
	

}
