import java.util.Scanner;

public class StringDemo12 {

     //Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
    //Example : 
    //original = “eabcdef’ ; result = “iabcdif”
    //Original = “xyz” ; result = “xyz”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.next();
        String s1 ="";

        s1=s1+s.replace('e', 'i');
        // for(int j=0; j<s.length(); j++){
        //     char c = s.charAt(j);
        //     if(c=='e'){
        //         j='i';
        //     }
        //     s1=s1+c;
           
        // }
         System.out.println(s1);



    }
    
}
