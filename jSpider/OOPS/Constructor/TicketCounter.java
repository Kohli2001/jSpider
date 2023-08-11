class TicketCounter{
    int no_of_tickets; 
    int ticket_counter;

    TicketCounter(int no_of_tickets , int ticket_counter){
        this.no_of_tickets = no_of_tickets;
        this.ticket_counter= ticket_counter;
    }

    void ticketAvailable(){
        System.out.println("Available Tickets : " +no_of_tickets);
    }
    void buyTickets(int n ){
        System.out.println("Buys  Tickets : " +n);
        if(no_of_tickets>=n){

             no_of_tickets-=n;
             System.out.println(" ticket Successfully Buy");

        }
        else{
        System.out.println("Sorry! U could not buy ticket right now due : Insufficent tickets " +no_of_tickets);
        }
       
    }
    void cancelTicket(int n){
        no_of_tickets+=n;
        System.out.println("Cancelled Ticket : " +n);
        System.out.println("Available Tickets : " +no_of_tickets);
        
    }
    
}
