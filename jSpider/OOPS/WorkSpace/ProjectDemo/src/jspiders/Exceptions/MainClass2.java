package learningExceptions;

public class MainClass2 {
	public static void main(String[] args) {
		
		ArithmeticException e1 = new ArithmeticException();
		Object o1 = new Object();
		
		MyArithmeticException e2 = new MyArithmeticException(null);
		
		System.out.println(e1 instanceof Throwable);
		System.out.println(o1 instanceof Throwable);
		System.out.println(e2 instanceof Throwable);
		
		throw e1;
		//throw o1;
		
	}

}
