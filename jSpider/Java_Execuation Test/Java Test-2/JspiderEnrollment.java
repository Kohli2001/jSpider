class JspiderEnrollment{
    String name;
    String degree;
    String email;
    long   phone;
    

    JspiderEnrollment(String name , String degree, String email){

        this.name = name;
        this.degree=degree;
        this.email=email;
        

        }

        JspiderEnrollment(String name , String degree,  long phone){
            this.name = name;
            this.degree = degree;
            
            this.phone=phone;
            
        }
        void displayP(){
            System.out.println("Enrollment done succefully with below Details");
            System.out.println("----------------------------------------------------");
            System.out.println("Studnet name :" +name);
            System.out.println("Studnet Degree :" +degree);
            System.out.println("Studnet phone :" +phone);
           
        }

         void displayE(){
            System.out.println("Enrollment Done successfully with with below Details");
            System.out.println("----------------------------------------------------");
            System.out.println("Student name :" +name);
            System.out.println("Student Degree :" +degree);
            // System.out.println("Studnet Enrolled course :" +course);
            System.out.println("Studnet Email :" +email);
           
        }
}