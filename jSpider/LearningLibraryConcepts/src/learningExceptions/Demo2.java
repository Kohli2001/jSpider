package learningExceptions;

public class Demo2 {
	public static void main(String[] args) {
		//we can handle all eceptions but jvm runs only one at a time 
		
		int x=100;
		int y=0;
		
		int res=0;

		int[] arr = new int[5];
		
		
		try {
			
			 res=x/y;
			 arr[5]=100;
			 
		}
		catch (ArithmeticException e) {
			System.out.println("can not divide by zero  "+e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array out of box" +e);
			
		}
		
	}

}
