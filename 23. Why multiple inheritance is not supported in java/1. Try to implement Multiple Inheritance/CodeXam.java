class Human1 {
    void eat() {
        System.out.println("Human 1 is eating");
    }
}
class Human2 {
    void eat() {
        System.out.println("Human 2 is eating");
    }
}
public class CodeXam extends Human1, Human2 {
    public static void main(String args[]) {
        CodeXam a = new CodeXam();
        a.eat();
    }
}


