class Employee{

        String eName;
        int eId;
        double eSalary;

        void updateename(String newName){

            System.out.println("Updating employee name......");

            eName = newName;
            
            
        }
        void updateeId(int newId){

            System.out.println("Updating employee Id.....");

            eId = newId;

        }
        void updateeSalary(double sal){

            System.out.println("Updating employee salary......");

            eSalary = sal;

        }
        
 
}


class Mainclass15{
    public static void main(String[] args) {
        

        Employee e1 = new Employee();

        e1.updateeId(54647);
        e1.updateename("Kamlesh");
        e1.updateeSalary(89078.00);

        System.out.println("Employee Id" +e1.eId);
        System.out.println("Employee Name" +e1.eName);
        System.out.println("Employee Salary" +e1.eSalary);


        








        
    }
}