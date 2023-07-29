class Program14{

 //MCQ 1) question based on  the functions structure and thei respectve output

    // public static boolean isEven(int num){
    //     if(num%2==0){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }

//MCQ 2) question based on  the functions structure and thei respectve output

    // public static boolean isEven(int num){
    //     if(num%2==0){
    //         System.out.println("even");

    //     }
    //     else{
    //         System.out.println("Not even");


    //     }
    //     return false;
        

    // }

//MCQ 3) question based on  the functions structure and thei respectve output
//    public static boolean isEven(int num){
//         if(num%2==0){
//             System.out.println("even");

//         }
//         else{
//             System.out.println("Not even");
//              return false;



//         }
//         return true;
       
    
// }

 //MCQ 4) question based on  the functions structure and their respectve output.
 
 

  public static boolean isEven(int num){
        if(num%2==0){
            System.out.println("even");
            return true;

        }
        else{
            System.out.println("Not even");
             return false;

        }
        //return true;    //>>>>>> unreacheable code 
    }


    
    public static void main(String[] args) {

        
        
       System.out.println(isEven(10));  //1st ans:>>>>> true   //2nd ans:>>>> even , false       //3rd ans:>>>> even , true  // 
       System.out.println(isEven(11));  //1st ans : >>>>>false   //2nd ans:>>>> Not even , false //3rd ans: >>>> not even , false 



       
    }
}