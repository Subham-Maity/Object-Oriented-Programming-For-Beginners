/*Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)*/


class Employee { // class name
    String name;  int salary; // instance variables
    public int getSalary() {
        return salary;
    }//getSalary method
    public String getName() {
        return name;
    }//get methods
    public void setName(String newName) {//setter
        name = newName;//set name
    }
}
public class CodeXam {
    public static void main(String[] args) {
        Employee subham = new Employee();//object creation
        subham.setName("Xam");//set name
        System.out.println( "Real name of the Subham is " +   subham.getName());//Real name of the Subham is Xam
        subham.salary = 2500002; //2500002 is the salary of Subham
        int salary = subham.getSalary();//salary is the salary of Subham
        System.out.println("Salary of subham is: " + salary);//salary is the salary of Subham
    }
}


