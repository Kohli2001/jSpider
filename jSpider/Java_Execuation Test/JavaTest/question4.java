import java.util.Scanner;

public class question4 {

    public static void TotalSalCalculation(double[]sal,double[] rat){

        double[] SalaryArray = new double[sal.length];

    for (int j = 0; j < SalaryArray.length; j++) {
        
         SalaryArray[j] = sal[j]+(sal[j]*rat[j]*10);
    } 

    System.out.println("Salary after Bonus");
    for (double d : SalaryArray) {
        System.out.println(d);
    }

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Employee");
        int n= sc.nextInt();

        double[] empSalaryArray = new double[n];

        for (int i = 0; i < empSalaryArray.length; i++) {

            System.out.println("enter the salary of "+(i+1)+" employee");

            empSalaryArray[i] = sc.nextDouble();
        }

        double[] empPerfArray = new double[n];

        for (int i = 0; i < empSalaryArray.length; i++) {
            System.out.println("enter the rating of "+(i+1)+" employee");
            empPerfArray[i]=sc.nextDouble();
        }

        TotalSalCalculation(empSalaryArray,empPerfArray);

        
}
}