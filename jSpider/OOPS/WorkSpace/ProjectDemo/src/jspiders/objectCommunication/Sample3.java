package objectCommunication;

public class Sample3 {
	
	void test(Demo3 arg , int x, int y) {
		System.out.println("Running Test methods");
		
		System.out.println(arg.x);
		System.out.println(arg.y);
		arg.disp();
		arg.x=x;
		arg.y=y;
		
	}

}
