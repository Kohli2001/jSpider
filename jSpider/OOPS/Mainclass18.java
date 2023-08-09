
class GpsLocation{
    String direction;
    double longitude;
    double latitude;


    void updateDirection(String newdirection){
        System.out.println("Updating Direction.....");
        direction = newdirection;

    }
    void updateLongitude(double newlongitude){
        System.out.println("Updating longitude");
        longitude = newlongitude;

    }
    void updateLatitude(double newlatitude){
        System.out.println("Updating latitude.............");
        latitude = newlatitude;

    }
    void updateLongiLati(double newlongitude , double newlatitude){
        System.out.println("Updating longitude and latitude............");
        longitude = newlongitude;
        latitude  = newlatitude;

    }
    void updateDirectLatiLongi(String newdirection,double newlatitude,double newlongitude  ){
        System.out.println("Updating longitude latitude and direction......");
        direction = newdirection;
        longitude = newlongitude;
        latitude  = newlatitude;


    }
    void updateLongiDirect(double newlongitude , String newdirection){
        System.out.println("Updating longitude and direction..........");
        longitude = newlongitude;
        direction = newdirection;

    }
    void updateLatiDirect(double newlatitude , String newdirection){
        System.out.println("Updating latitude and direction..........");
        latitude = newlatitude;
        direction = newdirection;

    }
    
    
}


class Mainclass18{
    public static void main(String[] args) {
        
        GpsLocation l1 = new GpsLocation();

        l1.updateDirectLatiLongi("n-s", 3.224, 8.340);

        System.out.println("Direction......."+l1.direction);
        System.out.println("longitude......."+l1.longitude);
        System.out.println("latitude......."+l1.latitude);

        l1.updateLongiDirect(7.2344, "north");
        System.out.println("Direction......."+l1.direction);
        System.out.println("longitude......."+l1.longitude);
        System.out.println("latitude......."+l1.latitude);

        l1.direction="South-East";
        System.out.println("Direction......."+l1.direction);
        System.out.println("longitude......."+l1.longitude);
        System.out.println("latitude......."+l1.latitude);
        





        
    }
}