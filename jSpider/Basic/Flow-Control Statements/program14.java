class program14{
    public static void main(String[] args) {
        double accBal = 50000.0;
        double withAmt = 1000.0;
        int attempts = 3;

        switch(attempts){
    case 1: 
            if(accBal>withAmt){
                accBal-=withAmt;
                System.out.println("Wuthdraw success");
                
                
            }
            else{
                if(accBal<withAmt){
                     System.out.println("withdraw failed : due to insufficient balance");

                }
                else{
                    System.out.println("withdraw failed: due to consumimg all the attempts");
                }
               
            }
            System.out.println("Account Balance "+accBal);
            break;

    case 2:
             if(accBal>withAmt){
                accBal-=withAmt;
                System.out.println("Wuthdraw success");
                
                
            }
            else{
                if(accBal<withAmt){
                     System.out.println("withdraw failed : due to insufficient balance");

                }
                else{
                    System.out.println("withdraw failed: due to consumimg all the attempts");
                }
               
            }
            System.out.println("Account Balance "+accBal);
            break;

            case 3:
             if(accBal>withAmt){
                accBal-=withAmt;
                System.out.println("Wuthdraw success");
                
                
            }
            else{
                if(accBal<withAmt){
                     System.out.println("withdraw failed : due to insufficient balance");

                }
                else{
                    System.out.println("withdraw failed: due to consumimg all the attempts");
                }
               
            }
            System.out.println("Account Balance "+accBal);
            break;

        }
    }
}