
//Static
/*
        1.Variable (also known as a class variable)
        2. (also known as a class method)
        3.Block
        4.Nested class
*/

class Student4 {
    static String school;
    String name;
}
























//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************

//Encapsulation

/*      Encapsulation is the process of combining data and functions into a single unit called class.
        In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class.
        In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes.
        Thus, encapsulation makes the concept of data hiding possible.(Data hiding: a language feature to restrict access to members of an object,
        reducing the negative effect due to dependencies. e.g. "protected", "private" feature in Java).*/



















//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************

//Abstraction
/*
We try to obtain an abstract view, model or structure of a real life problem, and reduce its unnecessary details.
        With definition of properties of problems,including the data which are affected and the operations which are identified,
        the model abstracted from problems can be a standard solution to this type of problems.
        It is an efficient way since there are nebulous real-life problems that have similar properties. In simple terms,
        it is hiding the unnecessary details & showing only the essential parts/functionalities to the user.

        Data binding : Data binding is a process of binding the application UI and business logic.
        Any change made in the business logic will reflect directly to the application UI.

        Abstraction is achieved in 2 ways :

        Abstract class
        - Interfaces (Pure Abstraction)
        -  Abstract Class

*/






//1. Abstract Class

/*      1.An abstract class must be declared with an abstract keyword.
        2.It can have abstract and non-abstract methods.
        3.It cannot be instantiated.
        4.It can have constructors and static methods also.
        5.It can have final methods which will force the subclass not to change the body of the method.*/
abstract class Animal2 {//Abstract class
    abstract void walk();//Abstract method
    void breathe() {//Non-abstract method
        System.out.println("This animal breathes air");//Non-abstract method
    }
    Animal2() {//Constructor
        System.out.println("You are about to create an Animal.");
    }
}

class Horse extends Animal2 {//Subclass
    Horse() {//Constructor
        System.out.println("Wow, you have created a Horse!");
    }
    void walk() {//Overriding
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal2 {//Subclass
    Chicken() {
        System.out.println("Wow, you have created a Chicken!");
    }
    void walk() {//Overriding
        System.out.println("Chicken walks on 2 legs");
    }
}











//2. Interfaces
/*      1.All the fields in interfaces are public, static and final by default.
        2.All methods are public & abstract by default.
        3.A class that implements an interface must implement all the methods declared in the interface.
        4.Interfaces support the functionality of multiple inheritance.*/


interface Animal3 {//Interface
    void walk();//  Abstract method

}

class Horse2 implements Animal3 {//Subclass
    public void walk() {//Implementing
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken2 implements Animal3 {//Subclass
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}


















//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************


//Access Modifiers in Java

/*
Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.


Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package.
If you do not specify any access level, it will be the default.


Protected: The access level of a protected modifier is within the package and outside the package through child class.
If you do not make the child class, it cannot be accessed from outside the package.


Public: The access level of a public modifier is everywhere. It can be accessed from within the class,
outside the class, within the package and outside the package.

Note:A setter updates the value of a variable, while a getter reads the value of a variable

*/



class Account {//class name
    public String name;//public variable
    protected String email;//protected variable
    private String password;//private variable

    public String getPassword() { //getter method to get the value of the private variable
        return this.password;
    }

    public void setPassword(String pass) {//setter method to set the value of the private variable
        this.password = pass;
    }

}






















//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************


//Inheritance:

/*
Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically.
In such a way, you can reuse, extend or modify the attributes and behaviors which are defined in other classes.
In Java, the class which inherits the members of another class is called derived class and the class whose
members are inherited is called base class. The derived class is the specialized class for the base class.*/

//1. Single inheritance : When one class inherits another class, it is known as single level inheritance or single inheritance.

class Shape {//super class
    public void area() {//method
        System.out.println("Displays Area of Shape");//method body
    }
}
//single level inheritance
class Triangle extends Shape {//sub class
    public void area(int h, int b) {//method
        System.out.println((1/2)*b*h);//method body
    }
}

//multilevel inheritance
class EquilateralTriangle extends Triangle{//sub class
    public void area(int l, int h){//method
        System.out.println(1/2*l*h);//method body
    }
}




//2. Hierarchical inheritance : Hierarchical inheritance is defined as the process of deriving more than one class from a base class.
class Shape2 {//super class
    public void area() {//method
        System.out.println("Displays Area of Shape");//method body
    }
}
class Triangle2 extends Shape2 {//sub class
    public void area(int h, int b) {//method
        System.out.println((1/2)*b*h);//method body
    }
}
class Circle2 extends Shape2 {//sub class
    public void area(int r) {
        System.out.println((3.14)*r*r);//method body
    }
}


//3. Multilevel inheritance : Multilevel inheritance is a process of deriving a class from another derived class.

class Shape3 {//super class
    public void area() {
        System.out.println("Displays Area of Shape");//method body
    }
}
class Triangle3 extends Shape3 {//sub class
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);//method
    }
}
class EquilateralTriangle3 extends Triangle3 {//sub class
    int side;//instance variable
}

//4. Hybrid inheritance : Hybrid inheritance is a combination of simple, multiple inheritance and hierarchical inheritance.
















//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************


//Compile Time Polymorphism

/*
        Polymorphism is the ability to present the same interface for differing underlying forms (data types).
        With polymorphism, each of these classes will have different underlying data. Precisely, Poly means ‘many’ and morphism means ‘forms’.

        Compile Time Polymorphism :
        The polymorphism which is implemented at the compile time is known as compile-time polymorphism. Example - Method Overloading

        Method Overloading : Method overloading is a technique which allows you to have more than one function with the same
        function name but with different functionality. Method overloading can be possible on the following basis:

        1.The return type of the overloaded function.

        2.The type of the parameters passed to the function.

        3.The number of parameters passed to the function.*/


class Animal {//parent class
    String name;//name of the animal
    int age;//age of the animal
    public void printInfo(String name){//function overloading
        System.out.println("Name: " + name );//overloading
    }
    public void printInfo(int age){//function overloading
        System.out.println("Age: " + age );//overloading
    }
    public void printInfo(String name, int age){//function overloading
        System.out.println("Name: " + name + " Age: " + age );//overloading
    }
}













//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************


//for separate class for separate all output
class extraLine{
    String line = "--------------------------------------------------------------------------------";
    public void printLine(){
        System.out.println(line);
    }
}

















//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************


//3.Copy Constructor


  /*  A Copy constructor is an overloaded constructor used to declare and initialize an object from another object.
There is only a user defined copy constructor in Java(C++ has a default one too).
Note : Unlike languages like C++, Java has no Destructor. Instead,
Java has an efficient garbage collector that deallocates memory automatically.*/

class Employee {// class Employee
    String name;// class Employee member name
    int age;// class Employee member age
    String address;// class Employee member address
    String phone;// class Employee member phone

    public void getEmployeeDetails() {// method getEmployeeDetails
        System.out.println("Name: " + this.name);// printing name
        System.out.println("Age: " + this.age);// printing age
        System.out.println("Address: " + this.address);// printing address
        System.out.println("Phone: " + this.phone);// printing phone

    }
    //3.Copy Constructor : It is used to copy the values of one object to another object.
    Employee (Employee emp2){// constructor Employee
        this.name = emp2.name;// assigning value to name
        this.age = emp2.age;// assigning value to age
        this.address = emp2.address;// assigning value to address
        this.phone = emp2.phone;// assigning value to phone
    }
    Employee (){// constructor blank Employee for default values emp1
    }

}













//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************

//concept of  Classes and Objects



       /*
        1. Classes
        Class is a user-defined data type which defines its properties and its functions. Class is the only logical representation of the data.
        For example, Human being is a class. The body parts of a human being are its properties, and the actions performed by the body parts are known as functions.
        The class does not occupy any memory space till the time an object is instantiated.

        2. Objects
        Object is a run-time entity. It is an instance of the class. An object can represent a person, place or any other item.
        An object can operate on both data members and member functions.
        */



class Pen{//class
    String color;//color of the pen
    String type; //ballpoint, fountain, etc.

    public void write(String text){//text is a parameter and write is a method
        System.out.println("Writing text: " + text);//text is a parameter
    }
    public void setColor(){//setColor is a method
        System.out.println("Setting color to " + this.color);//color is a parameter and this.color is a reference to the current object
    }
    public void setType(){//setType is a method
        System.out.println("Setting type to " + this.type);//type is a parameter and this.type is a reference to the current object
    }
}















//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************



//concept of this keyword



/*
‘this’ keyword :
‘this’ keyword in Java that refers to the current instance of the class.
In OOPS it is used to:

1. pass the current object as a parameter to another method
2. refer to the current class instance variable
‘this’ keyword : ‘this’ keyword in Java that refers to the current instance of the class.
In OOPS it is used to: pass the current object as a parameter to another method refer
to the current class instance variable*/



class student {//class
    String name;//name of the student
    int age;//age of the student
    String address;//address of the student
    String phone;//phone number of the student
    String email;//email of the student
    String school;//school of the student
    String grade;//grade of the student
    String major;//major of the student
    String gpa;//gpa of the student
    String status;//status of the student
    String date;//date of the student
    String time;//time of the student

    public void printInfo() {//printInfo is a method
        System.out.println("Name: " + this.name);//name is a parameter and this.name is a reference to the current object
        System.out.println("Age: " + this.age);//age is a parameter and this.age is a reference to the current object
        System.out.println("Address: " + this.address);//address is a parameter and this.address is a reference to the current object
        System.out.println("Phone: " + this.phone);//phone is a parameter and this.phone is a reference to the current object
        System.out.println("Email: " + this.email);//email is a parameter and this.email is a reference to the current object
        System.out.println("School: " + this.school);//school is a parameter and this.school is a reference to the current object
        System.out.println("Grade: " + this.grade);//grade is a parameter and this.grade is a reference to the current object
        System.out.println("Major: " + this.major);//major is a parameter and this.major is a reference to the current object
        System.out.println("GPA: " + this.gpa);//gpa is a parameter and this.gpa is a reference to the current object
        System.out.println("Status: " + this.status);//status is a parameter and this.status is a reference to the current object
        System.out.println("Date: " + this.date);//date is a parameter and this.date is a reference to the current object
        System.out.println("Time: " + this.time);//time is a parameter and this.time is a reference to the current object

    }













//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************


    //2. Parameterized constructor

   /* 2. Parameterized constructor :
    Constructor which has parameters is called a parameterized constructor. It is used to provide different values to distinct objects.*/

    student(String name, int age, String address, String phone, String email, String school, String grade, String major, String gpa, String status, String date, String time) {
        this.name = name;//name is a parameter and this.name is a reference to the current object
        this.age = age;//age is a parameter and this.age is a reference to the current object
        this.address = address;//address is a parameter and this.address is a reference to the current object
        this.phone = phone;//phone is a parameter and this.phone is a reference to the current object
        this.email = email;//email is a parameter and this.email is a reference to the current object
        this.school = school;//school is a parameter and this.school is a reference to the current object
        this.grade = grade;//grade is a parameter and this.grade is a reference to the current object
        this.major = major;//major is a parameter and this.major is a reference to the current object
        this.gpa = gpa;//gpa is a parameter and this.gpa is a reference to the current object
        this.status = status;//status is a parameter and this.status is a reference to the current object
        this.date = date;//date is a parameter and this.date is a reference to the current object
        this.time = time;//time is a parameter and this.time is a reference to the current object


    }


}













//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************


//main method to create objects and call methods
public class example1 {//class
    public static void main(String[] args) {//main method

              /*  When an object is created using a new keyword, then space is allocated for the
        variable in a heap, and the starting address is stored in the stack memory.*/


        extraLine e = new extraLine();//creating an object of the class extraLine


        Pen pen1 = new Pen();//object creation
        pen1.color = "red";//assignment
        pen1.type = "fountain";//assignment
        pen1.write("Hello World!");//method call
        Pen pen2 = new Pen();//object creation
        pen2.color = "green";//assignment
        pen2.type = "ballpoint";//assignment
        pen1.setColor();//method call
        pen2.setColor();//method call
        pen2.setType();//method call
        pen1.setType();//method call

        e.printLine();//calling the method print()

//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************

         //2. Parameterized constructor
        student student1 = new student("Subham", 21, "Kathmandu", "9841234567", "subham.com ", "Kathmandu University", "B.Sc", "Computer Science", "3.5", "pass", "12/12/2019", "12:00");//object creation
        student1.name = "Subham";//assignment
        student1.age = 20;//assignment
        student1.address = "123 Main St";//assignment
        student1.phone = "123-456-7890";//assignment
        student1.email = "abc.com";//assignment
        student1.school = "University of Washington";//assignment
        student1.grade = "A";//assignment
        student1.major = "Computer Science";//assignment
        student1.gpa = "4.0";//assignment
        student1.status = "Full-time";//assignment
        student1.date = "01/01/2020";//assignment
        student1.time = "12:00";//assignment
        student1.printInfo();//method call

        e.printLine();//calling the method print()

//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************


        //3.copy constructor
       Employee emp1 = new Employee();//object creation
       emp1.name = "Raj";//assignment
       emp1.age = 25;//assignment
       emp1.address = "186 Maintick St";//assignment
       emp1.phone = "12345-456-7890";//assignment

       Employee emp2 = new Employee(emp1);//object creation
       emp2.getEmployeeDetails();//method call


        e.printLine();//calling the method print()

//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************

        //polymorphism
        Animal animal1 = new Animal();//object creation
        animal1.name = "Lion";//assignment
        animal1.age = 10;//assignment

        animal1.printInfo(animal1.name);//method call
        animal1.printInfo(animal1.age);//method call
        animal1.printInfo(animal1.name,animal1.age);//method call

        e.printLine();//calling the method print()


       //inheritance
         Triangle triangle1 = new Triangle();//object creation
         triangle1.area();//method call
         e.printLine();//calling the method print()


//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************

        //Access Modifiers in Java
        Account a1 = new Account();//object creation
        a1.name = "Apna College";//assignment
        a1.setPassword("abcd");//method call
        a1.email = "hello@apnacollege.com";//assignment
        System.out.println(a1.getPassword());//method call

        e.printLine();//calling the method print()


//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************
        // Abstraction
        Horse horse = new Horse();
        horse.walk();
        horse.breathe();
        e.printLine();//calling the method print()
//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************

        Horse2 horse2 = new Horse2();
        horse2.walk();
        e.printLine();//calling the method print()
//*******************************************************************************************
// Language: java ***************************************************************************
//*******************************************************************************************

        Student4.school = "JMV";//assignment
        Student4 s1 = new Student4();//object creation
        Student4 s2 = new Student4();//object creation

        s1.name = "Meena";//assignment
        s2.name = "Beena";//assignment

        System.out.println(s1.school);//JMV
        System.out.println(s2.school);//calling the method print()
        e.printLine();//calling the method print()


    }
}


