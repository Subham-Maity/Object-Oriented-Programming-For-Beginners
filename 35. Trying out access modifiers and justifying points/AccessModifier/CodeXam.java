package AccessModifier;

public class CodeXam {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.method1();
        System.out.println(obj.a);
        System.out.println(obj.b);
        //System.out.println(obj.c);//I can't access the private variable from outside the class
        System.out.println(obj.d);
 }
}
