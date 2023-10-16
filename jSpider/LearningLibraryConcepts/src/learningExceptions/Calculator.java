package learningExceptions;

public class Calculator {
	double res;
	
void add(double num1, double num2) {
		
		res= num1+num2;
		System.out.println("Result "+res);
	}
	void sub(double num1, double num2) {
		res=num1-num2;
		System.out.println("Result "+res);
	}
	
	void mul(double num1, double num2) {
		res=num1*num2;
		System.out.println("Result "+res);
	}
	
	void divide(double num , double denum) {
		try {
			res=num/denum;
		}
		catch (ArithmeticException e) {
			System.out.println("Can not divide a number by zero");
		}
	
		
		System.out.println("Result "+res);
	}	
	
}
