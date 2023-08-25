package overRiding;

public class Instagram2016 extends Instagram2014 {
	
	void post() {
		super.post();
		System.out.println("Live Editing & Videos");
		
	}
	void message() {
		super.message();
		System.out.println("image chat");
	}
	void filter() {
		super.filter();
		System.out.println("video filtering");
	}
	void call() {
		super.call();
		System.out.println("Video calls");
	}

}
