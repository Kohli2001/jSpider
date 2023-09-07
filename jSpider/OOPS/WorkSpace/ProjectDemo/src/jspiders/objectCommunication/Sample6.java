package objectCommunication;

public class Sample6 {

	Demo6 test(int x, int y) {
		System.out.println("Running Test()");
		Demo6 d1 = new Demo6(x,y);
		return d1;
	}
}
