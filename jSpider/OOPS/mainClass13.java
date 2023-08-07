import java.util.Scanner;

class Account{
    static double accBal=10000000.00;
    static String ifsc_code = "SBI0016767";
    String accHolder;
    long accNum;
    String branch_Name;




}

class mainClass13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Account a1 = new Account();

       System.out.println("Enter your Branch name");
       a1.branch_Name = sc.next();
       System.out.println("Enter your Account Number");
       a1.accNum = sc.nextLong();
       System.out.println("Enter your Account Holder name");
       a1.accHolder = sc.next(); // why nextLine is taking as output
       
       System.out.println("-----------------------------------------");

       System.out.println("Account balance :"+Account.accBal);
       System.out.println("Account IFSC Code :"+Account.ifsc_code);
       System.out.println("Account Holder Name:"+a1.accHolder);
       System.out.println("Account Branch Name :"+a1.branch_Name);
       System.out.println("Account Number :"+a1.accNum);
       

       

        
    }

}