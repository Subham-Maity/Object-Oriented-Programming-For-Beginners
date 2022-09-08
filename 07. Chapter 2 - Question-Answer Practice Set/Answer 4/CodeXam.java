//1. Create a class cylinder and use getter and setters to set its radius and height and calculate surface and volume of the cylinder
//4.Repeat 1 for a sphere
class sphere {
    private double radius;
    private double height;
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
    public double getVolume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }
}
public class CodeXam {
    public static void main(String[] args) {
        sphere s = new sphere();
        s.setRadius(5);
        s.setHeight(10);
        System.out.println("Radius: " + s.getRadius());
        System.out.println("Height: " + s.getHeight());
        System.out.println("Surface Area: " + s.getSurfaceArea());
        System.out.println("Volume: " + s.getVolume());
    }
}


