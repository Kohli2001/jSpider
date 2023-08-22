package jspiders.p1;


public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 s1 = new Sample2();
		s1.display();
		

	}

}


class Sample1{
	int x = 100;
	

}

class Sample2 extends Sample1{
	int x = 200;
	void display() {
		int x=300;
		
		System.out.println("Local var x value is " +x);
		System.out.println("sub class instance var x " +this.x);
		System.out.println("super class instance var x " +this.x);
	}
}

