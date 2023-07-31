class Program19{

    public static void TotalMarks_Avg(double[] marks){
        double sum = 0;
        for (double total : marks) {
            sum+=total;
            //sum = sum+total;
        }
         System.out.println("Total marks of the students :"+sum);
        double avg = sum/marks.length;
        System.out.println("the average marks of the students is :" +avg);

    }
    public static void main(String[] args) {
        double [] StudentsMarks ={76.00, 89.00, 80.0, 95.0, 87.0};
        
        TotalMarks_Avg(StudentsMarks);

        
    }
}