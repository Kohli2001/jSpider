import java.util.Scanner;
class Program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter anything");
        char n = sc.next().charAt(0);

        if(n>='a' && n<='z' || n>='A' && n<='Z'){
            System.out.println("Alpha........");
        }
        else if(n>=1 && n<=9){
            System.out.println("numeric.....");
        }
        else{
            System.out.println("Special character");
        }
    }
}