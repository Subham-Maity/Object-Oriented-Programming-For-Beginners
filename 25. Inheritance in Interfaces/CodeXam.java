interface First {
    void show1();
    void show2();
}
interface Second extends First {
    void show3();
    void show4();
}
class Third implements Second {
    public void show1() {
        System.out.println("This is show1");
    }
    public void show2() {
        System.out.println("This is show2");
    }
    public void show3() {
        System.out.println("This is show3");
    }
    public void show4() {
        System.out.println("This is show4");
    }
}
public class CodeXam {
    public static void main(String[] args) {
        Third t = new Third();
        t.show1();
        t.show2();
        t.show3();
        t.show4();
    }
}
