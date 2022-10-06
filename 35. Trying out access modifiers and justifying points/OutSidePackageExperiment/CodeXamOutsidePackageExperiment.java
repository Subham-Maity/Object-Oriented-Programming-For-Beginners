package OutSidePackageExperiment;
import AccessModifier.AccessModifiers;

public class CodeXamOutsidePackageExperiment {
    public static void main(String[] args) {
        System.out.println("I'm using out side package experiment");
        AccessModifiers obj = new AccessModifiers();
        //obj.method1(); // I can't access the method1() from outside the package
        System.out.println(obj.a); // I can access the public variable a from outside the package
        //System.out.println(obj.b); // I can't access the protected variable from outside the package
        //System.out.println(obj.c); // I can't access the private variable from outside the package
        //System.out.println(obj.d); // I can't access the default variable from outside the package
    }
}
