class A{
    public void method1(){
        System.out.println("I am method 1 of class A");
    }
}

class B extends A{
    @Override
    public void method1(){
        System.out.println("I am method 1 of class B");
    }

}
public class CodeXam {
        public static void main(String[] args) {
        A a = new A();
        a.method1();

        B b = new B();
        b.method1();
    }
}

