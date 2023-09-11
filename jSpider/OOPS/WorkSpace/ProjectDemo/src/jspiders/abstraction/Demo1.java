package abstraction;

public interface Demo1 {
	
	void test();
	void disp();

}

class Sample1 implements Demo1{
	
	 public void test() {
		System.out.println("test() method implemented in Sample1 class");
	}
	 public void  disp() {
		 System.out.println("Disp() methods implemeted in Sample1");
		 
	 }
}