class program7{
    public static void main(String[] args) {
        // The price of the product store in an array the company wants to give an offer of 15% for each product . write a program to display in below formate.

        // original price               after decaount price

        double[] arr1={4200.00, 8900.00, 5678.00, 499.00};
        double discount =0;
        double offerPrice=0;

        System.out.println(".............................................");
        System.out.println("Original price \t after decount price");
        System.out.println(".............................................");

        for(double price :arr1){

            offerPrice=price*15.0/100;
            discount = price -offerPrice;

       
        System.out.println(price +"\t" +discount);

        

            
        }

       
    }
}