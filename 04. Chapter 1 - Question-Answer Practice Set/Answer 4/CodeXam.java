//4. Create a class Rectangle calculate the area and perimeter of the rectangle.
class Rectangle {
    int length,breadth;//instance variables
    public int getArea() {
        return length * breadth;
    } //method to calculate area
    public int getPerimeter() {
        return 2 * (length + breadth);
    }//method to calculate perimeter
}
public class CodeXam {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();//object creation
        rectangle.length = 10;//assigning values to instance variables
        rectangle.breadth = 20;//assigning values to instance variables
        System.out.println("Area of rectangle: " + rectangle.getArea());//calling method to calculate area
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());//calling method to calculate perimeter
    }
}


