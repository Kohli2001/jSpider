class program13{
    public static void main(String[] args) {
        
        
        //A customer can withdraw money from the account if the balace is sufficient , otherwise a customer can not withdraw the money? the bank has put a restructions that a customer can not withdraw more than 3 times in a day write a java program for above situations?

        double accBal = 100000.00;
        double withAmt = 2000.00;
        int attempts = 3;

        if(accBal>withAmt&& attempts!=0 && attempts<=3){
            accBal-=withAmt;
            System.out.println("Withdraw success");
            System.out.println("Account Balance "+accBal);
             
        }
        else if(accBal<withAmt){
            System.out.println("Withdraw failed:  due to insufficient balance");
        }
        else if(attempts<=4){
            System.out.println("Withdraw failed:  due to cosuming all the attemots to withdraw");
        }

    }
}