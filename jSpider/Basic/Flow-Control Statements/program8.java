class program8{
    
    public static void main(String[] args) {


        // now students can use any alpha wheatger its uppercase or lowercase it can able to get the grade of thier result //

        int grade = 'e';
        
        switch(grade){
            case 'a':
            case 'A' : System.out.println("First class with #");
            break;

            case 'b':
            case 'B': System.out.println("first class");
            break;

            case 'c':
            case 'C': System.out.println("second class ");

            case 'd':
            case 'D' :System.out.println("Just pass");
            break;

            case 'e':
            case 'E': System.out.println("Get Loss ! Fail");
            break;


            default :System.out.println("Invalide grade");

        }


    }
}