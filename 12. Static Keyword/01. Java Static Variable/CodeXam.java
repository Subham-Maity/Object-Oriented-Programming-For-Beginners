class Student{
    int rollNo;//instance variable
    String name;//instance variable
    static String college ="Neotia Institude of Technology and Management"; //static variable


    //constructor
    Student(int r, String n){ //local variable r and n
        rollNo = r; //instance variable = local variable r
        name = n; //instance variable = local variable n
    }



    //method to display the values
    void display (){
        System.out.println(rollNo+" "+name+" "+college); //here collage is static variable and rollNo and name are instance variable
    }
}



//Test class to show the values of objects  
public class CodeXam{
    public static void main(String[]args){
        Student s1 = new Student(43,"Subham");//creating an object of Student
        Student s2 = new Student(44,"Xam");//creating an object of Student

        //we can change the college of all objects by the single line of code
        Student.college="NITMAS";


        s1.display();
        s2.display();
    }
}  