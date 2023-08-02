public class Program24 
{
    public static void LastArray(int[] arr)
    {
       for(int i=(arr.length-1); i>=0;)
       {
          System.out.println("The last Element in Array:"+arr[i]);
          break;
       }
    } 
    public static void main(String[] args) {
         System.out.println("Main Method Started");
         int[] arg={1,2,3,4,5,6};
         LastArray(arg);
         System.out.println(  );
         System.out.println("Main Method Ended");

    }   
}
