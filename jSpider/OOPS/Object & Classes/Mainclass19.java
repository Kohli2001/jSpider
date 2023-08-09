
class Chair{
    String shape;
    String color;
    String brand;
    String materialName;
    double price;

    void updateShape(String size){
        System.out.println("updating shape of chair....");
        shape = size;   
    }
    void updatecolor(String newcolor){
        System.out.println("updating colour of chair....");
        color = newcolor;   
    }
    void updatebrand(String newbrand){
        System.out.println("updating brand of chair....");
        brand = newbrand;   
    }
    void updatematerial(String newmaterial){
        System.out.println("updating material of chair....");
        materialName = newmaterial;   
    }
    void updatePrice(double newprice){
          System.out.println("updating price of chair....");
          price = newprice;
    }

    
  
    
}

class Mainclass19{
    public static void main(String[] args) {
        Chair c1 = new Chair();
        System.out.println("details for 1st type of Chair ");
        System.out.println("============================================================");

        c1.updatecolor("Light Brown") ;
        c1.updatebrand("loyer") ;
        c1.updateShape("small") ;
        c1.updatematerial("plastic") ;
        c1.updatePrice(189.00);

        System.out.println("shape of the chair " +c1.shape);
        System.out.println("brand of the chair " +c1.brand);
        System.out.println("Colour of the chair " +c1.color);
        System.out.println("Material name of the chair " +c1.materialName);
        System.out.println("Price of the chair " +c1.price);

        c1.updatebrand("broded") ;
        c1.updatePrice(589.00);
        System.out.println("shape of the chair " +c1.shape);
        System.out.println("brand of the chair " +c1.brand);
        System.out.println("Colour of the chair " +c1.color);
        System.out.println(" Material name of the chair " + c1.materialName);
        System.out.println(" Price of the chair " + c1.price);

        Chair c2 = new Chair();
        System.out.println("details for 2nd type of Chair ");
        System.out.println("============================================================");



        c2.updateShape("medium") ;
        c2.updatebrand("broded") ;
        c2.updatePrice(999.00);

        System.out.println("shape of the chair " +c2.shape);
        System.out.println("brand of the chair " +c2.brand);
        System.out.println("Colour of the chair " +c2.color);
        System.out.println("Material name of the chair " + c2.materialName);
        System.out.println("Price of the chair " + c2.price);

        Chair c3 = new Chair();
        System.out.println("details for 3rd type of Chair ");
        System.out.println("============================================================");

        c3.updateShape("large") ;
        c3.updatebrand("broded") ;
        c3.updatePrice(1499.00);

        System.out.println("shape of the chair " +c3.shape);
        System.out.println("brand of the chair " +c3.brand);
        System.out.println("Colour of the chair " +c3.color);
        System.out.println("Material name of the chair " + c3.materialName);
        System.out.println("Price of the chair " + c3.price);
        
    }

}