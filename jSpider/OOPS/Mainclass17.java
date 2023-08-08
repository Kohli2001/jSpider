import java.util.Scanner;

class GraphPoint2d{
    
    double xaxis;
    double yaxis;

    void updatecordinate(double x , double y ){
        System.out.println("updating cordinates");

        xaxis  = x;
        yaxis = y;

    }
    void updateXonly(double x){
        System.out.println("updating x axis only");
        xaxis = x;
    }
    void updateYonly(double y ){
        System.out.println("updating y axis");
        yaxis = y;
    }
}



class Mainclass17{
    public static void main(String[] args) {
        
        GraphPoint2d p1 = new GraphPoint2d();

           p1.updateXonly(1.76);
           p1.updateYonly(9.5);
           p1.updatecordinate(3.2, 8.9);

           System.out.println("X aixs: " +p1.xaxis);
           System.out.println("Y aixs: " +p1.yaxis);

        // Scanner sc = new Scanner(System.in);

        // p1.xaxis = sc.nextDouble();
        // p1.yaxis = sc.nextDouble();

     


        
    }
}