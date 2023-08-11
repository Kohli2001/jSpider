import java.util.Scanner;

class MainClass5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){

        
        TicketCounter tc1 = new TicketCounter(120, 003);
        System.out.println("What You want to do\ntype 1 for Buy ticket\ntype 2 for cancel ticket");
        int option = sc.nextInt();
        

        if(option==1){
            System.out.println("Enter How many Ticket you want to Buy");
            int buy = sc.nextInt();
            tc1.buyTickets(buy);

        }
        else if(option==2){
            System.out.println("Enter How many Ticket you want to Cancel");
            int cancel = sc.nextInt();
            tc1.cancelTicket(cancel);

        }
        else{
            System.out.println("Sorry! Invalid input");
        }

        
    }
}
}