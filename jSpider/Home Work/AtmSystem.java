import java.util.Scanner;;

class AtmSystem{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double accBal = 100000.00;
        double withAmt , depoAmt;
        int options;



        System.out.println("what process you want to do \n Type 1 for Deposite \n Type 2 for Withdraw \n Type 3 for Balance Checking");
        options = sc.nextInt();

        if(options==1){

            //depositing fuctions

        System.out.println("Enter your depositng Amount");
        depoAmt = sc.nextDouble();

        accBal +=depoAmt;
        System.out.println("Successfully Deposite : " +depoAmt);
        System.out.println("Account Balance : " + accBal);

        }
        else if(options==2)
        {
            System.out.println("Welcome back to Withdraw Process");

         //withdraw functions 
           System.out.println("Enter your Withdraw Amount");
           withAmt = sc.nextDouble();

         if(accBal>=withAmt){
       
        accBal -=withAmt;

        System.out.println("Successfully Withdraw :" +withAmt);
        System.out.println("Account Balance: "+accBal);

         }
         else{
            System.out.println("SORRY! Insufficient Account Balance to Withdraw :" +accBal);
         }


        }
        else if(options==3){
            System.out.println("Account Balance : " +accBal);
        }


    
        
    }
}