package overRiding;

public class Instagram2022  extends Instagram2020{
	

	void Stories() {
		super.Stories();
		System.out.println("60 sec ");
	}
	void live() {
		super.live();
		System.out.println("Many to many");
	}
	void post() {
		super.post();
		System.out.println("Carousel videos");
	}
	void message() {
		super.message();
		System.out.println("msg indicator and selfreply");
	}
	void stickers() {
		super.stickers();
		System.out.println("Own Avtar");
	}
	void shop() {
		System.out.println("Insragram Business Adds");
	}
	void reels() {
		super.reels();
		System.out.println("Reels videos: duration 30 sec");
	}

}
