package org.jsp.signleTonDesign;

public class Bus {
	
		private Bus() {
		
			}
	
	private static Bus b;
	
	static public Bus getBus() {
		if(b==null) 
			b=new Bus();
			return b;
			
	}
	public void bookTicket() {
		System.out.println("Ticket has been booked..!");
		
		}
	

	

}
