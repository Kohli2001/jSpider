

class Customer{

    String cus_name;
    String cus_id;
    String purchase_product;
    int quentity;

    Customer(String cus_name, String cus_id  , String purchase_product , int quentity){

        this.cus_name=cus_name;
        this.cus_id= cus_id;
        this.purchase_product=purchase_product;
        this.quentity=quentity;

    }
    void display(){
        System.out.println("Customer Details as Follwoing: ");
        System.out.println("==========================================");
        System.out.println("Customer Name: "+cus_name);
        System.out.println("Customer ID: "+cus_id);
        System.out.println("Purchase Product Name : "+purchase_product);
        System.out.println("Quentity: "+quentity);
    }


    
}