class SuperThis {
    int a;

    public int getA() {
        return a;
    }

    SuperThis(int a) {
       this.a = a;
    }
    public int returnOne() {
        return 1;
    }

}
public class CodeXam {
    public static void main(String[] args) {
        SuperThis s = new SuperThis(5);
        System.out.println(s.getA());
    }
}




