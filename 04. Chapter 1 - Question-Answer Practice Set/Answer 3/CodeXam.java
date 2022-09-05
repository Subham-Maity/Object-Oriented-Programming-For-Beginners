//3. Create a class Square with a method to initialize its side, calculating area, perimeter etc.
class Square {
    int side;//instance variable of class Square to store side of square
    public int getArea() {
        return side * side;
    } //method to calculate area of square
    public int getPerimeter() {
        return 4 * side;
    }//method to calculate perimeter of square
}
public class CodeXam {
    public static void main(String[] args) {
        Square s = new Square(); //creating object of class Square
        s.side = 5; //initializing side of square
        System.out.println("Area of square is: " + s.getArea()); //printing and calling method to calculate area of square
        System.out.println("Perimeter of square is: " + s.getPerimeter());//printing and calling method to calculate perimeter of square
    }
}


