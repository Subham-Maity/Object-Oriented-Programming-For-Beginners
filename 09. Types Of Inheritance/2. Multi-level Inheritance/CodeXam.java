class GrandFather {
   public void showGrandFather() {
            System.out.println("GrandFather");
        }
}
class Father extends GrandFather {
    public void showFather() {
        System.out.println("Father");
          }
}
class Son extends Father {
    public void showSon() {
                System.out.println("Son");
          }
}
public class CodeXam {
    public static void main(String[] args) {
        Son s = new Son();
        s.showGrandFather();
        s.showFather();
        s.showSon();
    }
}