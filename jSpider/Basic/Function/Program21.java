class Program21{

    public static int[] multiplyElement(int[]arr , int n){
        int[] newArray = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            newArray[i] = arr[i]*n;
        }
        return newArray;
    }
    public static void main(String[] args) {
        int [] array = {10,20,30,40};
        int [] res =multiplyElement(array, 2); 
        System.out.println(res);    
        
    }
}