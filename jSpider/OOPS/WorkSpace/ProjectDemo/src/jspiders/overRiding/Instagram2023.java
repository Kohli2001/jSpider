package overRiding;

public class Instagram2023 extends Instagram2022{
	
	void shop() {
		super.shop();
		System.out.println("Insragram Monitizations");
		
	}
	void reels() {
		super.reels();
		System.out.println("Reels videos: duration 60 sec");
	}
	void threads() {
		System.out.println("Threads");
	}
	
	
	
}
