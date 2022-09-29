//Create an abstract class pen with methods write () and refill () as abstract methods Now Use the pen class to create a concrete class fountain pen with an additional method change Nib ()

abstract class pen {
    abstract void write();
    abstract void refill();
}

class fountainPen extends pen {
    @Override
    void write() {
        System.out.println("Write");
    }

    @Override
    void refill() {
        System.out.println("Refill");
    }

    void changeNib() {
        System.out.println("Change Nib");
    }
}


public class CodeXam {
    public static void main(String[] args) {
        fountainPen fp = new fountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();

    }
}