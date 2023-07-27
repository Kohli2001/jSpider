class Program7{

    public static void Square(int num){
        int res = num*num;
        System.out.println("Square of the "+num+" ="+res);
    }



    public static void main(String[] args) {

        System.out.println("main method started");

        Square(5);

        for(int i=1; i<=10; i++){
            Square(i);
        }

        System.out.println("main method Ended");
        
    }
    
}