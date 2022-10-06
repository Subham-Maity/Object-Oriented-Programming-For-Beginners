package OutSidePackageSubclassExperiment;
import AccessModifier.AccessModifiers;

class Sub extends AccessModifiers {
    void method2() {
        System.out.println("I'm using out side package subclass experiment");
        //AccessModifiers obj = new AccessModifiers();
        //obj.method1(); // I can't access the method1() from outside the package
        System.out.println(a); // I can access the public variable a from outside the package
        System.out.println(b); // I can access the protected variable from outside the package
        //System.out.println(obj.c); // I can't access the private variable from outside the package
        //System.out.println(obj.d); // I can't access the default variable from outside the package
    }


}


public class OutSidePackageSubclassExperiment {
    public static void main(String[] args) {
        
        Sub obj = new Sub();
        obj.method2();
      
    }
}
