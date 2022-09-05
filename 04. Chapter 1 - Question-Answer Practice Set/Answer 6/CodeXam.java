//6. Create a class Circle calculate the area and perimeter of the rectangle.
class Circle{ //class
     double radius , area , perimeter;//variables 
     public double getArea(){// method to calculate area
        area = 3.14 * radius * radius;//formula for area
        return area;
    }
    public double getPerimeter(){ //method to calculate perimeter
        perimeter = 2 * 3.14 * radius;//formula for perimeter
        return perimeter;
    }
}
public class CodeXam {
    public static void main(String[] args) {//main method
        Circle c = new Circle();//object creation
        c.radius = 5;//assigning value to radius
        System.out.println("Area of circle is : " + c.getArea());//printing area
        System.out.println("Perimeter of circle is : " + c.getPerimeter());//printing perimeter

    }
}