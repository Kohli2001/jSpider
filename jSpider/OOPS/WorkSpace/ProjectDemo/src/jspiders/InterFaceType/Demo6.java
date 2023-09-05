package interfaceType;

public interface Demo6 {
	void m1();

}
interface Demo7{
	void m2();
}



class Sample6 implements Demo6,Demo7{
	
	public void m1() {
		System.out.println("m1() implemented in sample 6");
	}
	public void m2() {
		System.out.println("M2() implemeted in sample 6");
	}
	
}
