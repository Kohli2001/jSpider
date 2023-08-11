class AccountBank{
    String bankHolder;
    double accBalance;
    long accNumber;

    AccountBank(String bankHolder, double accBalance, long accNumber){
        this.bankHolder=bankHolder;
        this.accBalance=accBalance;
        this.accNumber= accNumber;

    }
    void deposite(double depoAmt){
        accBalance+=depoAmt;
        System.out.println("Deposit Amount is Rs: " +depoAmt);
        System.out.println("Deposit Successfully Available Balance Rs: " +accBalance);
    
    }
    void withdraw(double withAmt){
        if(accBalance>withAmt){
            accBalance-=withAmt;
            System.out.println("Withdraw Success Rs:"+withAmt);
            System.out.println("Available balance Rs:"+accBalance);
        }
        else{
            System.out.println("Withdraw Failed due to insufficient A/c Balance");
        }
    }
    void AvailableBalance(){
        System.out.println("A/c Balance Rs: "+accBalance);
    }
    void details(){
        System.out.println("Bank Holder Name: "+bankHolder+"\nA/C Number: "+accNumber);
    }
}