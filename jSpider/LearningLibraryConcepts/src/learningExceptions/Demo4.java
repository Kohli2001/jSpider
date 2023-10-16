package learningExceptions;

public class Demo4 {
	public static void main(String[] args) {
		
		try {
			int x=100;
			int y=20;
			int re=x/y;
			
		}
		finally {
			System.out.println("I run Always ");
		}
	}

}
