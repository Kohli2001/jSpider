class Program3{
    public static void main(String[] args) {
        //Constant Concepts in Java
        //we can make variables as CONSTANTmusing final Keywords 
        
        final double pi = 3.14;
        System.out.println(pi);

        //re-iniliazations of pi is impossible because of final Keywords 
        //pi = 4.23;

        System.out.println(pi); 
        /*//>>>> getting ERROR Program3.java:10: error: cannot assign a value to final variable pi
        pi = 4.23;
        ^
1 error
/* */
    
    }
}