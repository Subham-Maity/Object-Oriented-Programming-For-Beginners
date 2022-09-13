class Fan {
    //state
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed; //levels: 0 to 5

    //constructors

    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    //methods
    public String toString() {
        return String.format("Make : %s, Radius : %f, Color : %s, Is On : %b, Speed : %d",
                make,
                radius,
                color,
                isOn,
                speed);
    }
}
public class CodeXam {
    public static void main(String[] args) {
        Fan fan = new Fan("Fan-Tastic", 0.456, "GREEN");
        System.out.println(fan);
    }
}




