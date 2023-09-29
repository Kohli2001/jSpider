package learningExceptions;

public class Demo5 {
	public static void main(String[] args) {
		
		//common catch block for multiple exceptions
		int x=10;
		int y=10;
		int res=0;
		int [] arr=new int[5];
		
		try {
			res=x/y;
			arr[1]=70;
			arr[5]=100;
			
		}
		catch (ArithmeticException |ArrayIndexOutOfBoundsException e) {
			
			if(e instanceof ArithmeticException) {
				System.out.println("can not divide by zero" +e);
			}
			else {
				System.out.println("insertion must be in  range" +e);
			}
			
		}
		
	}

}
