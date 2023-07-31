class Program18{
    public static void TotalSal(double[] sal , double bonus){
        for (double salary : sal) {
            salary=+salary+bonus/100;
            System.out.println(salary);
            
        }
        
    }
    public static void main(String[] args) {
        double[] empsalaries={35000.00, 23000.00, 750000.00, 65000.00};

        System.out.println("Total salry including bonus of 10% :");
        TotalSal(empsalaries, 10.00);
        
        
    }
}