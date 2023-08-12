import java.util.Scanner;
class Program5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Year");

        int year=sc.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year!");
        }
    }
}