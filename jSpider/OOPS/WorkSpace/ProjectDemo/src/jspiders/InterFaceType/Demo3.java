package interfaceType;

public interface Demo3 {
	void test();
	void disp();
	

}

abstract class Sample2 implements Demo3{
	
	public void test() {
		System.out.println("test method implemented in Sample2");
	}
	
}
class Sample3 extends Sample2{
	public void disp() {
		System.out.println("disp method implemeted in Sample2");
	}
}
