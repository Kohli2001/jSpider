package objectCommunication;

public class Sample2 {
	
	void test(Demo2 arg) {
		System.out.println("Running Test methods ");
		System.out.println(arg.x);
		System.out.println(arg.y);
		
		arg.disp();
		
		arg.x=100;
		arg.y=200;
		
	}

}
