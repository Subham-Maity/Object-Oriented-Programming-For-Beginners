class Cars {
    private int wheel;
    private int light;
    private String color;
    private String size;
    private String speed;
    private String model;

    public Cars() {
        this.wheel = 4;
    }

    public int getWheel() {
        return wheel;
    }
    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getLight() {
        return light;
    }

    public void setLight(int light) {
        this.light = light;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getSpeed() {
        return speed;
    }
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

}
    public class CodeXam {
        public static void main(String args[]) {

            Cars tesla = new Cars();
            tesla.setWheel(4);
            tesla.setLight(4);
            tesla.setColor("red");
            tesla.setSize("small");
            tesla.setSpeed("fast");
            tesla.setModel("model 3");

            System.out.println("Tesla has " + tesla.getWheel() + " wheels");
            System.out.println("Tesla has " + tesla.getLight() + " lights");
            System.out.println("Tesla is " + tesla.getColor());
            System.out.println("Tesla is " + tesla.getSize());
            System.out.println("Tesla is " + tesla.getSpeed());
            System.out.println("Tesla is " + tesla.getModel());

            Cars lamborghini = new Cars();
            lamborghini.setWheel(4);
            lamborghini.setLight(4);
            lamborghini.setColor("yellow");
            lamborghini.setSize("small");
            lamborghini.setSpeed("fast");
            lamborghini.setModel("model 3");

            System.out.println("Lamborghini has " + lamborghini.getWheel() + " wheels");
            System.out.println("Lamborghini has " + lamborghini.getLight() + " lights");
            System.out.println("Lamborghini is " + lamborghini.getColor());
            System.out.println("Lamborghini is " + lamborghini.getSize());
            System.out.println("Lamborghini is " + lamborghini.getSpeed());
            System.out.println("Lamborghini is " + lamborghini.getModel());

            Cars ferrari = new Cars();
            ferrari.setWheel(4);
            ferrari.setLight(4);
            ferrari.setColor("red");
            ferrari.setSize("small");
            ferrari.setSpeed("fast");
            ferrari.setModel("model 3");

            System.out.println("Ferrari has " + ferrari.getWheel() + " wheels");
            System.out.println("Ferrari has " + ferrari.getLight() + " lights");
            System.out.println("Ferrari is " + ferrari.getColor());
            System.out.println("Ferrari is " + ferrari.getSize());
            System.out.println("Ferrari is " + ferrari.getSpeed());
            System.out.println("Ferrari is " + ferrari.getModel());

            Cars bugatti = new Cars();
            bugatti.setWheel(4);
            bugatti.setLight(4);
            bugatti.setColor("red");
            bugatti.setSize("small");
            bugatti.setSpeed("fast");
            bugatti.setModel("model 3");

            System.out.println("Bugatti has " + bugatti.getWheel() + " wheels");
            System.out.println("Bugatti has " + bugatti.getLight() + " lights");
            System.out.println("Bugatti is " + bugatti.getColor());
            System.out.println("Bugatti is " + bugatti.getSize());
            System.out.println("Bugatti is " + bugatti.getSpeed());
            System.out.println("Bugatti is " + bugatti.getModel());


            Cars porsche = new Cars();
            porsche.setWheel(4);
            porsche.setLight(4);
            porsche.setColor("red");
            porsche.setSize("small");
            porsche.setSpeed("fast");
            porsche.setModel("model 3");

            System.out.println("Porsche has " + porsche.getWheel() + " wheels");
            System.out.println("Porsche has " + porsche.getLight() + " lights");
            System.out.println("Porsche is " + porsche.getColor());
            System.out.println("Porsche is " + porsche.getSize());
            System.out.println("Porsche is " + porsche.getSpeed());
            System.out.println("Porsche is " + porsche.getModel());
        }
    }

