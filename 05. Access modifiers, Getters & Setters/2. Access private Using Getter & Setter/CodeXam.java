class Employee {
    private int id;
    private String name;
    public void setId(int n){id = n;} 
    public void setName(String s){name = s;} 
    public String getName(){return name;}
    public int getId(){return id;}

}
public class CodeXam {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId(43);
        emp1.setName("Xam");
        System.out.println("Your real name is " + emp1.getName());
        System.out.println("Your ID is " + emp1.getId());
    }
}


