import java.util.Scanner;

 class question2 {

    public static void bill(double[] price,double rate){
        double total=0.0;
        for(int i=0;i<price.length;i++){

            total=price[i]+(price[i]*rate)/100;
            System.out.println("total price :"+total);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] pprice= {25.53,45.42,43.52,19.74,28.13};
        System.out.println("enter gst in percentage");
        int gst =sc.nextInt();

        bill(pprice,gst);
       

    }
 }
 
