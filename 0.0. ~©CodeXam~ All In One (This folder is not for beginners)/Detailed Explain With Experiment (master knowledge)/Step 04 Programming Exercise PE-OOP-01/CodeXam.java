 class Rectangle {
    //state:
    private int length;
    private int width;

    //creation:
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //behaviors:
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2*(length + width);
    }

    public String toString() {
        return String.format("Rectangle - length : %d, width : %d, area : %d, perimeter : %d",
                length,
                width,
                area(),
                perimeter());
    }
}
public class CodeXam {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 23);
        System.out.println(rectangle);
        rectangle.setWidth(25);
        System.out.println(rectangle);
        rectangle.setLength(20);
        System.out.println(rectangle);
    }
}

