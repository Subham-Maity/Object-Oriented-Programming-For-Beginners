//Constructors in Inheritance in Java
class Base {
    Base() {
        System.out.println("I am a Base Constructor");
    }
    Base(int x) {
        System.out.println("I am a Base Constructor with value " + x);
    }
}
class Derived  extends Base{
    Derived() {
        super(3);
        System.out.println("I am a Derived Constructor");
    }
}
public class CodeXam {
    public static void main(String[] args) {
        Derived d = new Derived();

    }
}


