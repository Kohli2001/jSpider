class Program17{

    public static void printArrayElements(int[] arg){
        System.out.println("printing the array elements");
        for (int element : arg) {
            System.out.print(element + " ");
            
        }

    }
    public static void main(String[] args) {
        int[] array = {67,3,16,31,19};
         printArrayElements(array);

        

    }
}