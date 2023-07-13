class program6 {
    public static void main(String[] args) {
        //A students has taken 5 attempts of a competative exam. in all attempts the students  has passed . the each atttempts score store in array write a program to find store of all the score and aggrate (Average )of the score?

        //1st method

        double [] scores = {78.00, 90.0, 54.0, 35.00, 89.8};
        double sum =0;
        double aggrate = 0;

        // for(int i=0; i<scores.length; i++){
        //     sum+=scores[i];
        //     aggrate = sum/5.0;

        // }
        // System.out.println("Total scores:" +sum);
        // System.out.println("Total aggrate :" +aggrate);

        //2nd method

        for(double n :scores){
            sum= sum+n;
            // sum+=n;
            aggrate=sum/5.0;

        }
        System.out.println("Total Scores" +scores);
        System.out.println("Total average" + aggrate);
    }
}