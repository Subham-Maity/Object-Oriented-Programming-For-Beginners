class Employee { // class name
    int id; // instance variable or data member or field
    String name; // instance variable or data member or field

    int salary; // instance variable or data member or field



    //this method is used to print the employee details
    public void printDetails() { // method
        System.out.println("Employee id is: " + id);
        System.out.println("Employee name is: " + name);
    }

    public int getSalaray() { // method
        return salary;
    }


}
public class CodeXam {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        // Create an object of Employee class

        Employee subham = new Employee();
        Employee rohit = new Employee();


        //assigning values to the attributes for subham
        subham.id = 43;
        subham.name = "Xam";
        subham.salary = 2500002;

        //assigning values to the attributes for rohit
        rohit.id = 44;
        rohit.name = "Rohit";
        rohit.salary = 250000;

       //calling method to print the details of Employee
        subham.printDetails();//here subham
        rohit.printDetails();//here rohit

        int salary = subham.getSalaray();
        System.out.println("Salary of subham is: " + salary);

        int salary1 = rohit.getSalaray();
        System.out.println("Salary of rohit is: " + salary1);

    }
}

