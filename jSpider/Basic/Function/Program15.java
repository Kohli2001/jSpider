class Program15{


    public static void unconditionalFunction(int num)
    {
        // System.out.print(num+" ");

        unconditionalFunction(++num);
        // System.out.println(" ");
        System.out.println(num);
    
    }


    public static void main(String[] args) {
        unconditionalFunction(1);


        
    }
}