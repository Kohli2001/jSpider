class Program27{

    public static void TestScore(double[] marks){
        double sum=0.0; double mul=1; double avg=1;;
       for (double elements : marks) {
        sum+=elements;
        mul*=elements;
       avg=sum/marks.length;

        
       }
       System.out.println("Total marks:"+sum);
       System.out.println("multiplication of the marks:"+mul);
        System.out.println("Average marks :"+avg);


    }
    public static void main(String[] args) {
        //write  a function to 5 test score , the fnction should multiple of the all the test score and avg score and both shoul be printed

        double [] scores = {56.0,90.0, 78.0, 65.0, 87.0};
        TestScore(scores);

    }
}