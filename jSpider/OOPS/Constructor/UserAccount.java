class UserAccount{
    String username;
    String password;
    String email;
    long phone;
    char gender;

    UserAccount(String username, String password, String email, char gender){
        this.username = username;
        this.password=password;
        this.email=email;
        this.gender=gender;


    }
     UserAccount(String username, String password, long phone, char gender){
        this.username = username;
        this.password=password;
        this.phone=phone;
        this.gender=gender;
}       
        void display(){
            System.out.println("Username :"+username);
            System.out.println("Password :" +password);
            System.out.println("email id : "+email);
            System.out.println("gender : "+gender);
            
        }
        void display2(){
            System.out.println("Username: "+username);
            System.out.println("Password:" +password);
            System.out.println("gender: "   +gender);
            System.out.println("phone number: "+phone);
        }



}