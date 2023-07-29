class Program12{


    //write a java program to calculate the tax pay by a amout for an emplyoee using functions take tax rate as 25%

    public static double TaxCalculator(double sal , double rate){
        double taxAmt = (sal*rate)/100;
        return taxAmt;
    }
    public static void main(String[] args) {

        double taxPlayble = TaxCalculator(30000, 25);  //  Both assigning the value and storing the values bot the things u can say 
        System.out.println("tax playable by an employee is "+taxPlayble);


        // System.out.println(TaxCalculator(25000, 25));  // printing the values 
        
    }
}