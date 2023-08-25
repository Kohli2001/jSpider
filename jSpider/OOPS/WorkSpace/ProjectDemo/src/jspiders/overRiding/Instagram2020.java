package overRiding;

public class Instagram2020  extends Instagram2018{

	
	void Stories() {
		super.Stories();
		System.out.println("30 sec ");
	}
	void live() {
		super.live();
		System.out.println("Two to many");
	}
	void post() {
		super.post();
		System.out.println("Carousel Posts");
	}
	void message() {
		super.message();
		System.out.println("Archieve");
	}
	void stickers() {
		super.stickers();
		System.out.println(" Stories and chat useble");
	}
	void reels() {
		System.out.println("Reels videos: 15 sec");
	}
	
}
