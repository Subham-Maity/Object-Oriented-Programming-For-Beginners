//1. Create a class cylinder and use getter and setters to set its radius and height and calculate surface and volume of the cylinder
//2. Use a constructor and repeat 1
class Cylinder {
    private double radius;
    private double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

}
public class CodeXam {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 3);
        System.out.println("Surface Area: " + cylinder.getSurfaceArea());
        System.out.println("Volume: " + cylinder.getVolume());

    }
}


