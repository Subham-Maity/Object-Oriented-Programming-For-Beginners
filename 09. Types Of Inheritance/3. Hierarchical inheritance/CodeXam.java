class Father {
    public void print() {
        System.out.println("Father");
    }
}
class Son1 extends Father {
    public void print() {
        System.out.println("son1");
    }
}
class Son2 extends Father {
    public void print() {
        System.out.println("son2");
    }
}
class Daughter extends Father {
    public void print() {
        System.out.println("daughter");
    }
}
public class CodeXam {
    public static void main(String[] args) {
        Father f = new Father();
        f.print();
        Son1 s1 = new Son1();
        s1.print();
        Son2 s2 = new Son2();
        s2.print();
        Daughter d = new Daughter();
        d.print();
    }
}