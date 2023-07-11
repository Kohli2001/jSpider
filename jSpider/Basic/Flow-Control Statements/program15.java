class program15{
    public static void main(String[] args) {
        double accBal = 50000.0;
        double withAmt = 1000.0;
        int attempts = 3;

        while(accBal>withAmt && attempts!=0 && attempts<=3){
            accBal-=withAmt;
            attempts--;
            System.out.println("Withdraw Success");


        }
       if(attempts==0){
        System.out.println("Withdraw failed: due to consuming attempts");
       }
       else if(accBal<=withAmt){
        System.out.println("Withdraw failed: due to insufficients balance ");
       }
       System.out.println("Account balance:" +accBal);

    }
}