package interfaceType;

public interface Demo4 {
//	public static void main(String[] args) {
//		Sample1 s1 = new Sample1();
//		s1.disp();
//		
//	}
	void test();
	

}
interface Demo5 extends Demo4{
	void disp();
}

class Sample1 implements Demo5{

	@Override
	public void test() {
		System.out.println("Test() impleted inside the sample1");
		
		
	}

	@Override
	public void disp() {
		System.out.println("disp() impleted inside the sample1");
		
		
	}
	
}
