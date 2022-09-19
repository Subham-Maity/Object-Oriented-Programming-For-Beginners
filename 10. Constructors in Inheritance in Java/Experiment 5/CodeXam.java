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
        System.out.println("I am a Derived Constructor");
    }
    Derived(int x , int y) {
        super(x);
        System.out.println("I am a Derived Constructor with value " + y);
    }

}
public class CodeXam {
    public static void main(String[] args) {
        Derived d = new Derived();

    }
}


