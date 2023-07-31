class Program20{

    public static int findOccarance(int[] arr , int num){
        int occrance = 0;
        for (int number : arr) {
            if(number==num){
                occrance++;
            }
        
        }
         return occrance;
        
    
        
    }
    public static void main(String[] args) {
        int [] numbers = {1,2,1,4,2,5,6,16,23,16};
        int num = 16 ;
        int res= findOccarance(numbers, num);
        System.out.println("the occrance of the given number "+num +" is :" +res);
        
    }
}