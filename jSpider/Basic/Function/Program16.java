class Program16{


    public static void conditionalFun(int n){
          

        if(n<=10){
        conditionalFun(++n); 

         System.out.print(n+ " ");
     
            
        }

    }
    public static void main(String[] args) {
        conditionalFun(1);
        

    }
}