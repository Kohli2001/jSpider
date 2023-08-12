import java.util.Scanner;
class question1{

    public static void AtmMachine(double amt , int pin){
        double balAmt = 20000;
        int ActualPin = 1612;
        if(ActualPin==pin && balAmt>amt){
            System.out.println("Succesfully login");
            balAmt= balAmt-amt;
            System.out.println("Withdraw Amount: "+amt);
            System.out.println("Withdraw success: "+balAmt);
        }
            else{
                System.out.println("Withdraw failed due to insufficient balance or Incorrect Pin");
            }
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter your ATM pin");
        int pin = sc.nextInt();
        System.out.println("Enter withdraw amount");
        double withAmt = sc.nextDouble();
       

        AtmMachine(withAmt, pin);
        
    }
    
}