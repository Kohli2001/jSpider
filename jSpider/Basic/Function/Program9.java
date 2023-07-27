class Program9{

    public static void gstCal(double price){

        double res = (price*18)/100;
        System.out.println("GST of the given price "+price+" RS:" +res);
    }
    public static void main(String[] args) {
        System.out.println("Main method started ");

        gstCal(1000);
        gstCal(25000);
        gstCal(75000);
        gstCal(95000);
        System.out.println("Main method Ended ");
    }
}