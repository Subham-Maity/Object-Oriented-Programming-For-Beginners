interface Human1 {
   default void eat() {
        System.out.println("Human 1 is eating");
    }
}
interface Human2 {
    default void eat() {
        System.out.println("Human 2 is eating");
    }
}
public class CodeXam implements Human1, Human2 {
    public void eat() {
        Human1.super.eat();
        Human2.super.eat();
    }
    public static void main(String[] args) {
        CodeXam c = new CodeXam();
        c.eat();
    }
}

