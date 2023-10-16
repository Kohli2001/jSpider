package learningExceptions;

public class Demo3 {
	public static void main(String[] args) {
		int [] arr = new int[5];
		int x=100;
		int y=0;
		int res=0;
		
		try {
			System.out.println("entered into outer try block");
			try {
				System.out.println("enter into inner try block");
				res= x/y;
				System.out.println("existing from inner try block");
			}
			catch (ArithmeticException e) {
				System.out.println("can not divied number by zero " +e);
			}
			
			arr[5]=100;
			System.out.println("existing outer try block");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("should insert within size only" +e);
			
		}
		System.out.println("result:" +res);
		
	}
	

}
