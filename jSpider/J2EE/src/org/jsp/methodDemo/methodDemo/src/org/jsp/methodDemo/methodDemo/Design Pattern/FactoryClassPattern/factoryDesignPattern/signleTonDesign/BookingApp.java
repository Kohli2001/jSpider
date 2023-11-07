package org.jsp.signleTonDesign;

public class BookingApp {
	
	public static void main(String[] args) {
		
		Bus b1 = Bus.getBus();
		b1.bookTicket();
		System.out.println(b1);
		
		
		
		System.out.println("====================");
		Bus b2 = Bus.getBus();
		b2.bookTicket();
        System.out.println(b2);
        
        
       
        
	}

}
