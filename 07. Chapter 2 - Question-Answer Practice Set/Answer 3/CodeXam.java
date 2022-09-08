//3. Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
class Rectangle {
    int length;
    int breath;
    Rectangle() {
        length = 5;
        breath = 5;
    }
    Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }
    int area() {
        return length * breath;
    }

}
public class CodeXam {
    public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            System.out.println("using default constructor "+ rectangle.area());
            Rectangle rectangle1 = new Rectangle(10, 10);
            System.out.println("using constructor overloading "+rectangle1.area());

    }
}


