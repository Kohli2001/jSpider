
class UserAccount{

    String username;
    String password;
    String email;
    long phone;

    void updateusername(String newUsername){
        System.out.println("updating user name....");
        username = newUsername;
    }
    void updatepassword(String newpassword){
        System.out.println("Updating password...");

        password = newpassword;
    }
    void updateemail(String newemail){
        System.out.println("updating email.......");
        email =  newemail;
   
    }
    void updatePhone(long newphone){
        System.out.println("Updating phone..........");

        phone = newphone;
    }
}


class MainClass16{
    public static void main(String[] args) {

        System.out.println("Main method started");

        UserAccount u1 = new UserAccount();
        u1.updateusername("Kamlesh kumar kohli");
        u1.updatePhone(9693631293l);
        u1.updateemail("kamleshkumarkohli7@gmail.com");
        u1.updatepassword("kamlesh@31XXX");


        System.out.println("User Name : " +u1.username);
        System.out.println("User password : " +u1.password);
        System.out.println("User email id : " +u1.email);
        System.out.println("User phone no : " +u1.phone);

        System.out.println("Main methods ended");

    }
}