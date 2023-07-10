class program6{
    public static void main(String[] args) {
        
        //A customer can withdrwa account balance from his account in ATM. before the customer has to provide valid atmPin , if the pin is invalid the customer can not withdraw money??

        double accBal = 500000.00;
        double withBal = 100000.00;
        int actual_pin = 2244;
        int entered_pin = 2344;

        if(entered_pin==actual_pin)
        {
            System.out.println("Success");

            if(accBal>=withBal){
                accBal -=withBal;
            
                System.out.println("withdraw successfully done" + withBal);

            }
            else{
                System.out.println("insufficent balance");
            }
        }
        else{
            System.out.println("Invalide Entered Pin ");
        }

    }
}