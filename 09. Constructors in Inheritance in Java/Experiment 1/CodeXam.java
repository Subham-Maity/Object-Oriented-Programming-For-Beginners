//Constructors in Inheritance in Java
class Base {
    Base() {
        System.out.println("I am a Base Constructor");
    }
}
class Derived  extends Base{
    Derived() {
        System.out.println("I am a Derived Constructor");
    }
}
public class CodeXam {
    public static void main(String[] args) {
        Derived d = new Derived();

    }
}
