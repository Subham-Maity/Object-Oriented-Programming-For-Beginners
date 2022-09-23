 class MotorBike {
    //state
    private int speed;
    //behavior
    MotorBike() {
        this(5);
    }

    MotorBike(int speed) {
        if(speed > 0)
            this.speed = speed;
    }

    public void start() {
        System.out.println("Bike started!");
    }

    public void setSpeed(int speed) {
        if(speed > 0)
            this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }
}
public class CodeXam {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);
        MotorBike yamaha = new MotorBike();
        ducati.start();
        honda.start();
        yamaha.start();

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(yamaha.getSpeed());

        ducati.increaseSpeed(50);
        yamaha.setSpeed(250);
        honda.increaseSpeed(100);
        yamaha.decreaseSpeed(50);
        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(yamaha.getSpeed());
    }
}




