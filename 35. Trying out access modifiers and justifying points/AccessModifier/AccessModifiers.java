package AccessModifier;
public class AccessModifiers {
    public int a = 1; // accessible everywhere in the program (default)
    protected int b = 2;// accessible in the same package and subclasses of the class
    private int c = 3;// accessible only in the same class where it is declared
    int d = 4;// accessible in the same package only

    public void method1() { //I can access all the access modifiers in the same class
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}

