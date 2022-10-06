package CodeXamCalculator;


class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
class ScientificCalculator extends Calculator {
    public double sin(int a) {
        return Math.sin(a);
    }

    public double cos(int a) {
        return Math.cos(a);
    }

    public double tan(int a) {
        return Math.tan(a);
    }

    public double log(int a) {
        return Math.log(a);
    }
}
class HybridCalculator extends ScientificCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public double sin(int a) {
        return Math.sin(a);
    }

    public double cos(int a) {
        return Math.cos(a);
    }

    public double tan(int a) {
        return Math.tan(a);
    }

    public double log(int a) {
        return Math.log(a);
    }
}

public class CodeXam {
public static void main(String[] args) {
    HybridCalculator hc = new HybridCalculator();
    System.out.println(hc.add(2, 3));
    System.out.println(hc.sub(2, 3));
    System.out.println(hc.mul(2, 3));
    System.out.println(hc.div(2, 3));
    System.out.println(hc.sin(2));
    System.out.println(hc.cos(2));
    System.out.println(hc.tan(2));
    System.out.println(hc.log(2));
   }
}
