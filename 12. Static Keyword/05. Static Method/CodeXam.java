class Student{
    int rollNo;
    String name;
    static String college = "Neotia Institude of Management and ";
    //static method to change the value of static variable
    static void change(){
        college = "NITMAS";
    }
    //constructor to initialize the variable
    Student(int r, String n){
        rollNo = r;
        name = n;
    }
    //method to display values
    void display(){
      System.out.println(rollNo+" "+name+" "+college);
    }
}
//Test class to create and display the values of object
public class CodeXam{
    public static void main(String args[]){
        Student.change();//calling change method
        //creating objects
        Student s1 = new Student(43,"Subham");
        Student s2 = new Student(56,"Xam");
        Student s3 = new Student(44,"Subhasish");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}