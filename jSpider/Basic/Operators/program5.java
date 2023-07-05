//to calculate simple intrest eqauations 

class program5{
   public static void main(String[] args) {
    //variables  

        double rate, principle_value , time;
        double simple_intrest ;

        //initializations 


        rate = 4.0;
        principle_value = 400000.00;
        time = 4;

     

        simple_intrest = principle_value*rate*time/100;

        System.out.println("the simple intrest of the given data is :" +simple_intrest);

    }
}