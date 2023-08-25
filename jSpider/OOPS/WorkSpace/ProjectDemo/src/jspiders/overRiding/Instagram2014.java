package overRiding;

public class Instagram2014 extends Instagram2012 {
	
	void post() {
		super.post();
		System.out.println("College video & pics");
		
	}
	void message() {
		super.message();
		System.out.println("Images shared");
	}
	void filter() {
		super.filter();
		System.out.println("Photos Editing");
	}
	void call() {
		System.out.println("Voice calls");
	}
	

}
