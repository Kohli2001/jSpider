class program5 {
    public static void main(String[] args) {
        // A custumer wants to withdraw amount from his account using ATM . the program in the ATM should allow to withdraw the money if the balance is sufficient if not the code should not allow to withdraw??? 

        double accBal = 10000.00;
        double withBal = 30000000.00;

        System.out.println(" Account balance: " +accBal);

        if(accBal>=withBal){
            accBal -=withBal;
            System.out.println("Withdraw balance is " +withBal);
            System.out.println("Successfully Withdraw");
            System.out.println("Total Account balance: "+accBal);
        }
        else {
            System.out.println("Withdraw balance is " +withBal);
            System.out.println("Balance insuffient to withdraw");
            System.out.println("Account balance :" +accBal);
           

    }
}
}