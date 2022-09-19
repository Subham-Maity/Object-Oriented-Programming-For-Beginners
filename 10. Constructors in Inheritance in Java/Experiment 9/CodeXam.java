class Base {
    Base() {
        System.out.println("I am a Base Constructor");
    }
    Base(int x) {
        System.out.println("I am a Base Constructor with value " + x);
    }
}
class Derived  extends Base {
    Derived() {
        System.out.println("I am a Derived Constructor");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I am a Derived Constructor with value " + y);
    }
}

    class ChildOfDerived extends Derived{
        ChildOfDerived() {
            System.out.println("I am a ChildOfDerived Constructor");
        }
        ChildOfDerived(int x , int y , int z) {
            super(x , y);
            System.out.println("I am a ChildOfDerived Constructor with value " + z);
        }
}


public class CodeXam {
    public static void main(String[] args) {
        ChildOfDerived obj = new ChildOfDerived(1,2,3);

    }
}


