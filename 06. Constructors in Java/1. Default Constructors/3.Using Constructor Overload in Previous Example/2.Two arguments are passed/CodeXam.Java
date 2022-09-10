class Employee {
    private int id; private String name;
    public Employee() {
        id = 45;
        name = "Xam";
        System.out.println(name + " is the best teacher and his id is " + id);
    }
    public Employee(int myId, String myName) {
        id = myId;
        name = myName;
        System.out.println(name + " is the best teacher and his id is " + id);
    }
    public Employee(int myId) {
        id = myId;
        System.out.println("Subham is the best teacher and his id is " + id);
    }
    public void setId(int n){ id = n;}
    public void setName(String s){name = s;}
    public String getName(){return name;}
    public int getId(){return id;}

}
public class CodeXam {
    public static void main(String[] args) {
        Employee shubham = new Employee(43, "Shubham");
    }
}


