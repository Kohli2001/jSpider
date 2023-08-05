import java.util.Scanner;
class question3{

    public static void awardGrade(double marks ){
        // for(double score : marks){
            if(marks>=80.00){

                System.out.println("Excellent");

            }
            else if(marks>70.00  )  //&& marks<=79.99
            {
                System.out.println("Very Good");
            }
            else if(marks>60.00 ){  //&& marks <=69.99
                System.out.println("Good");

                
            }
            else{
                System.out.println("BAD");
            }

        }
       
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your makrs");
        double marks = sc.nextDouble();
        awardGrade(marks);

        
         
    }


}
