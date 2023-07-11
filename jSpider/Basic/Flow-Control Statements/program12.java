class program12{
    public static void main(String[] args) {
        
        // A customer has a bank balance of 20,000 , write a java program to withdraw 2000 , five times . print the balance available after 5 withdraw?

        double accBal = 6000.00;
        double withAmt = 2000.00;


        for(int i=1 ; i<=5; i++){

            if(accBal>withAmt){
                accBal -=withAmt;
                System.out.println("withdraw success");
               
                
        }
        else{
            System.out.println("Withdraw failed: due to insufficient balance ");
             break; // it is for avoiding to print unessesary failed attempts 
                    // breaks is basically used to end the loop or stop the execuations 
        }
       

        }
         System.out.println("Account balance =" +accBal);

        
    }
}