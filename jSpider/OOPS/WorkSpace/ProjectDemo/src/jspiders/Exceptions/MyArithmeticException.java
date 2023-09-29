package learningExceptions;

public class MyArithmeticException  extends ArithmeticException{
	
	MyArithmeticException(String message){
		
		super(message);
		
	}

}

class Mainclass{
	public static void main(String[] args) {
		
		MyArithmeticException e1 = new MyArithmeticException("wrong attemps");
		
		System.out.println(e1.getMessage());
		
	}
}
