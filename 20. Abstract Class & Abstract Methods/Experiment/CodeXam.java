abstract class Parent2{
    public Parent2(){
        System.out.println("Parent2 Constructor");
    }
    public void sayHello(){
        System.out.println("Hello from Parent2");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Night");
    }
}
// An Abstract Class is basically a blueprint that can be used to create other classes. It is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I'm child3");
    }
}
public class CodeXam {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error
        Child2 c = new Child2();
        //Child3 c3 = new Child3(); -- error
    }
}