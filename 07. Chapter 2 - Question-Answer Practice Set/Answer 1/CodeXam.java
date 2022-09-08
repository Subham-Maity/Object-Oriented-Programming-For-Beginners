//1. Create a class cylinder and use getter and setters to set its radius and height and calculate surface and volume of the cylinder
class Cylinder {
    private double radius;
    private double height;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double cy_radius) {
        radius = cy_radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double cy_height) {
          height = cy_height;
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
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.5);
        cylinder.setHeight(2.5);
        System.out.println("height: " + cylinder.getHeight());
        System.out.println("radius: " + cylinder.getRadius());
        System.out.println("Surface Area of Cylinder is: " + cylinder.getSurfaceArea());
        System.out.println("Volume of Cylinder is : " + cylinder.getVolume());
    }
}


