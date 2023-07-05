//write a progrm to perform deposite and withdraw operation in java 

class program6{
    public static void main(String[] args) {
        double accBalance = 6500000.00;
        double depoAmt = 5000.00;
        double withAmt = 1000000.00;



        accBalance = accBalance+depoAmt;
        System.out.println("the depositing amount ="+depoAmt);
        System.out.println("Total account balance = "+accBalance);

        accBalance = accBalance-withAmt;
        System.out.println("the withdraw amount= "+withAmt);
        System.out.println("Total account balance = "+accBalance);



    

    }
    
}