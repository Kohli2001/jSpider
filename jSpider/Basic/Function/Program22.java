class Program22{
    public static void SumOfArray(int[] arrNumbers){
        int sum=0;
        for (int elements : arrNumbers) {
            sum = sum+elements;
           
        }
         System.out.println("sum of the Array = "+sum);
            
    }

    public static int SumOfArray2(int[] arr){
        int sum=0;
        for(int element :arr){
            sum+=element;
        }
        return sum;
    }
    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50,60,70,80,90};
         SumOfArray(arr);
         int arraNumbers = SumOfArray2(arr);
         System.out.println(arraNumbers);
    
    


    }
}