class GrandFather {
    public void print() {
        System.out.println("I am grandfather.");
    }
}
class Father extends GrandFather {
    public void print() {
        System.out.println("I am father.");
    }
}
class Son extends Father {
    public void print() {
        System.out.println("I am son.");
    }
}
class Daughter extends Father {
    public void print() {
        System.out.println("I am daughter.");
    }
}

public class CodeXam {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.print();
   }
}

