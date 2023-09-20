import java.util.Scanner;

public class StringArray12 {

    //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.



    
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = sc.nextInt();
        String [] str = new String[size];
        System.out.println("Enter the string arrays");
        //int cumLength = 0;
        for(int i=0; i<str.length; i++ ){
            str[i] = sc.next();


           // cumLength = cumLength+str[i].length();
        }
        
    //     System.out.println("entered array string are :");
    //     for(int i=0; i<str.length; i++){
    //         System.out.println(str[i]);
            
    //     }
    //    System.out.println("combined length of string is: "+cumLength);

    }



    
}


