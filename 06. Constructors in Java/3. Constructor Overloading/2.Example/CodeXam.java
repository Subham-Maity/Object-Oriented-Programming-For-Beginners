class Employee {
    Employee(String s, int i){
        System.out.println("The name of the first employee is : " + s);
        System.out.println("The id of the first employee is : " + i);
    }
    Employee(String s, int i, int salary){
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of second employee is : " + salary);
    }
}
public class CodeXam {
    public static void main(String[] args) {
        Employee shubham = new Employee("Shubham",43);
        Employee harry = new Employee("Subhasish",44,95000);
    }
}



