class Rectangle {
    private int length;
    private int breadth;
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int area() {
        return length * breadth;
    }
}

class Cuboid extends Rectangle {
    private int height;
    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int volume() {
        return area() * height;
    }
}


public class CodeXam{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("The length is " + rectangle.getLength() + " and breadth is "
                + rectangle.getBreadth());
        System.out.println("The area of rectangle is " + rectangle.area());


        Cuboid cuboid = new Cuboid(10, 20, 30);
        System.out.println("The length is " + cuboid.getLength() + " and" + " the breadth is "
                + cuboid.getBreadth() + " and" + " the height is " + cuboid.getHeight());
        System.out.println("Area of cuboid: " + cuboid.area());
        System.out.println("Volume of cuboid: " + cuboid.volume());
    }
}

